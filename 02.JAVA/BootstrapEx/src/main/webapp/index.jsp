<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
<!-- 
	CDN방식 
	CDN(Content Delivery Network, 콘텐트 전송 네트워크)
	라이브러리 파일을 폴더에 저장하지 않고 인터넷(네트워크)를 통해 사용하는 방식
-->
<style>
	#align{
		height : 100px;
	}
	
	.col{
		border : 1px solid black;
	}
</style>
</head>
<body>
	<div class="container">container</div>
	<div class="container-sm">small container</div>
	<div class="container-md">md container</div>
	<div class="container-lg">lg container</div>
	<div class="container-xl">xl container</div>
	<div class="container-xxl">xxl container</div>
	
	<div class="container text-center border border-primary">
		<div class="row border">
			<div class="col-6 border">
				컬럼1
			</div>
			<div class="col-md-auto border">
				컬럼2
			</div>
			<div class="col-2 border">
				컬럼3
			</div>
		</div>
		<div class="row border">
			<div class="col border">
				컬럼3
			</div>
			<div class="col border">
				컬럼4
			</div>
		</div>
	</div>
	
	
	<div class="container-lg border">
		<div class="row row-cols-5">
			<div class="col">1</div>
			<div class="col">2</div>
			<div class="col">3</div>
			<div class="col">4</div>
			<div class="col">5</div>
			<div class="col">6</div>
		</div>
	</div>
	
	<div id="align" class="container border">
		<div class="row">
			<div class="col">
				1
			</div>
			<div class="col">
				2
			</div>
			<div class="col">
				3
			</div>
		</div>
	</div>
	
	<div class="accordion" id="accordionExample">
		<div class="accordion-item">
		  <h2 class="accordion-header">
		    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
		      Accordion Item #1
		    </button>
		  </h2>
		  <div id="collapseOne" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
		    <div class="accordion-body">
		      <strong>This is the first item's accordion body.</strong> It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.
		    </div>
		  </div>
		</div>
		<div class="accordion-item">
		  <h2 class="accordion-header">
		    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
		      Accordion Item #2
		    </button>
		  </h2>
		  <div id="collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
		    <div class="accordion-body">
		      <strong>This is the second item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.
		    </div>
		  </div>
		</div>
		<div class="accordion-item">
		  <h2 class="accordion-header">
		    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
		      Accordion Item #3
		    </button>
		  </h2>
		  <div id="collapseThree" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
		    <div class="accordion-body">
		      <strong>This is the third item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.
		    </div>
		  </div>
		</div>
		</div>
	
	<div id="liveAlertPlaceholder"></div>
	<button type="button" class="btn btn-primary" id="liveAlertBtn">Show live alert</button>
	
	
	<br><br>
	<h1>h1 <span class="badge text-bg-secondary">new</span></h1>
	<h3>h3 <span class="badge text-bg-danger">new</span></h3>
	
	<br>
	<button type="button" class="btn btn-primary">
		클릭! <span class="badge text-bg-danger">5</span>
	</button>
	
	<br>
	<button type="button" class="btn btn-success position-relative">
		메시지
		<span 
		class="rounded-pill badge position-absolute top-0 start-100 bg-danger translate-middle">
			5
		</span>
	</button>
	
	<br>
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb">
			<li class="breadcrumb-item active" aria-current="page">
				<a href="#">Home</a>
			</li>
			<li class="breadcrumb-item" aria-current="page">
				<a href="#">Login</a>
			</li>
		</ol>
	</nav>
	
	<br>
	<button type="button" class="btn btn-primary">버튼1</button>
	<input type="button" value="버튼2" class="btn btn-primary">
	<button type="button" class="btn btn-outline-primary">버튼3</button>
	<button type="button" class="btn btn-primary btn-sm">버튼4</button>
	<button type="button" class="btn btn-primary btn-lg">버튼5</button>
	
	<div id="carouselExampleIndicators" class="carousel slide">
		<div class="carousel-indicators" style="background-color:black;">
		  <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		  <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
		  <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
		  <div class="carousel-item active">
		    <img src="spade-2.png" class="d-block w-100" alt="...">
		  </div>
		  <div class="carousel-item">
		    <img src="spade-3.png" class="d-block w-100" alt="...">
		  </div>
		  <div class="carousel-item">
		    <img src="spade-7.png" class="d-block w-100" alt="...">
		  </div>
		</div>
		<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
		  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		  <span class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
		  <span class="carousel-control-next-icon" aria-hidden="true"></span>
		  <span class="visually-hidden">Next</span>
		</button>
	</div>
	
	
	<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
	  Launch demo modal
	</button>
	
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        <input type="text">
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	        <button type="button" class="btn btn-primary">Save changes</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	
	<p class="d-inline-flex gap-1">
		<button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
		  Button with data-bs-target
		</button>
	</p>
		<div class="collapse" id="collapseExample">
		<div class="card card-body">
		  Some placeholder content for the collapse component. This panel is hidden by default but revealed when the user activates the relevant trigger.
		</div>
	</div>
	
	<div class="dropdown">
		<button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
		  Dropdown button
		</button>
		<ul class="dropdown-menu">
		  <li><a class="dropdown-item" href="#">Action</a></li>
		  <li><a class="dropdown-item" href="#">Another action</a></li>
		  <li><a class="dropdown-item" href="#">Something else here</a></li>
		</ul>
	</div>
	
	
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
		  <a class="navbar-brand" href="#">Navbar</a>
		  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		      <li class="nav-item">
		        <a class="nav-link active" aria-current="page" href="#">Home</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Link</a>
		      </li>
		      <li class="nav-item dropdown">
		        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
		          Dropdown
		        </a>
		        <ul class="dropdown-menu">
		          <li><a class="dropdown-item" href="#">Action</a></li>
		          <li><a class="dropdown-item" href="#">Another action</a></li>
		          <li><hr class="dropdown-divider"></li>
		          <li><a class="dropdown-item" href="#">Something else here</a></li>
		        </ul>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link disabled" aria-disabled="true">Disabled</a>
		      </li>
		    </ul>
		    <form class="d-flex" role="search">
		      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
		      <button class="btn btn-outline-success" type="submit">Search</button>
		    </form>
		  </div>
		</div>
		</nav>
		
	<button class="btn btn-primary" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasExample" aria-controls="offcanvasExample">
		Button with data-bs-target
	</button>
	
	<div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
	<div class="offcanvas-header">
	  <h5 class="offcanvas-title" id="offcanvasExampleLabel">Offcanvas</h5>
	  <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
	</div>
	<div class="offcanvas-body">
	  <div class="">
	    Some text as placeholder. In real life you can have the elements you have chosen. Like, text, images, lists, etc.
	  </div>
	  <div class="dropdown mt-3">
	    <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
	      Dropdown button
	    </button>
	    <ul class="dropdown-menu">
	      <li><a class="dropdown-item" href="#">Action</a></li>
	      <li><a class="dropdown-item" href="#">Another action</a></li>
	      <li><a class="dropdown-item" href="#">Something else here</a></li>
	    </ul>
	  </div>
	</div>
	</div>
	
	
	<nav aria-label="Page navigation example">
		<ul class="pagination justify-content-center">
		  <li class="page-item"><a class="page-link" href="#">Previous</a></li>
		  <li class="page-item"><a class="page-link" href="#">1</a></li>
		  <li class="page-item"><a class="page-link" href="#">2</a></li>
		  <li class="page-item"><a class="page-link" href="#">3</a></li>
		  <li class="page-item"><a class="page-link" href="#">Next</a></li>
		</ul>
	</nav>
	
	<script>
		const alertPlaceholder = document.getElementById('liveAlertPlaceholder')
		const appendAlert = (message, type) => {
		  const wrapper = document.createElement('div')
		  wrapper.innerHTML = [
		    `<div class="alert alert-danger alert-dismissible" role="alert">`,
		    `   <div>경고!!!!</div>`,
		    '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
		    '</div>'
		  ].join('')
	
		  alertPlaceholder.append(wrapper)
		}
	
		const alertTrigger = document.getElementById('liveAlertBtn')
		if (alertTrigger) {
		  alertTrigger.addEventListener('click', () => {
		    appendAlert('Nice, you triggered this alert message!', 'success')
		  })
		}
	</script>
</body>
</html>