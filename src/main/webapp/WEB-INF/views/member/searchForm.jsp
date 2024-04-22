<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<c:set var = "contextPath" value="${pageContext.request.contextPath}" />

<script>
    // 검색어 보내기
    function submitForm(obj) {
        var searchTerm = document.querySelector('.input_search').value;
        
        console.log("검색어:", searchTerm);
        
        obj.action = "${contextPath}/product/searchList.do";
        obj.submit();
    }
    
    document.addEventListener("DOMContentLoaded", function() {
        var inputSearch = document.querySelector(".input_search");
        inputSearch.addEventListener("keypress", handleEnterKey);
    });
    
    function handleEnterKey(event) {
        // 눌린 키가 Enter 키인지 확인
        if (event.keyCode === 13) {
            // form을 제출
            submitForm(document.getElementById("searchForm"));
        }
    }
    
    
    function imageFormSubmit() {
        var form = document.getElementById('searchForm');
        
        // 폼의 속성을 변경
        form.action = "/finalpro/analyzeImage.do";
        form.enctype = "multipart/form-data";
        form.method = "POST";
        
        // 폼 제출
        form.submit();
    }    

</script>



<script>
document.addEventListener("DOMContentLoaded", function() {
    var inputSearch = document.querySelector('.input_search');
    var resetIcon = document.getElementById('resetIcon');

    // 텍스트 입력 필드에 텍스트가 입력되면 X 표시 보이기
    inputSearch.addEventListener('input', function() {
        if (this.value.length > 0) {
            resetIcon.style.display = 'block';
        } else {
            resetIcon.style.display = 'none';
        }
    });

    // X 표시 클릭 시 입력 필드 리셋
    resetIcon.addEventListener('click', function() {
        inputSearch.value = '';
        resetIcon.style.display = 'none'; // X 표시 숨기기
        inputSearch.focus(); // 입력 필드에 다시 포커스
    });
});
</script>

<body>
	<a href="/finalpro/main.do"><img src="/finalpro/resources/image/cancel2.png" id="cancel"></a>
    <div id="all">
        <div class="search_container">
            <div class="search_wrap">
                <div class="search_area">
                    <div class="search">
                        <form id="searchForm">
						    <input type="text" placeholder="브랜드, 상품, 프로필, 태그 등" title="검색창" class="input_search" name="keyword">
						    <svg id="resetIcon" viewBox="0 0 24 24" width="24" height="24" xmlns="http://www.w3.org/2000/svg" style="cursor: pointer; display: none;">
						        <path d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm5 13.59L15.59 17 12 13.41 8.41 17 7 15.59 10.59 12 7 8.41 8.41 7 12 10.59 15.59 7 17 8.41 13.41 12 17 15.59z"/>
						    </svg>
						    <img src="/finalpro/resources/image/searchCamera-removebg-preview.png" id="camera">
						    <input type="file" id="upload-image" name="image" onchange="imageFormSubmit();" hidden="hidden">
						    <!-- SVG X 표시 추가 -->
						    
						</form>

                    </div>
                </div>
            </div>
        </div>
	</div>
	
	
<script type="text/javascript">
  document.getElementById('camera').addEventListener('click', function() {
      document.getElementById('upload-image').click();
  });
</script>			
</body>
</html>