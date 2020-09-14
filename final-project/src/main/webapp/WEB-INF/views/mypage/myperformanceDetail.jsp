<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>같이 보자! 공공연한사이</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"/>
    <link rel="stylesheet" href="/resources/css/style.css"/>
    <link rel="stylesheet" href="/resources/css/card.css"/>
    <link rel="stylesheet" href="/resources/css/mypage.css"/>
    <link rel="stylesheet" href="/resources/css/ticket.css"/>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script
            src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.4.4/umd/popper.min.js"></script>
    <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.color.js"></script>
    <script type="text/javascript" src="/resources/js/custom.js"></script>
    <script type="text/javascript" src="/resources/js/mypage/myperformanceDetail.js"></script>
</head>
<body>
<div class="header">
    <%@ include file="../common/navi.jsp" %>
</div>
<div class="body mt-5">
    <div class="container-fluid mb-4">
        <div class="row">
            <%@ include file="./mypagemenubar.jsp" %>
            <div class="col-8 mt-4">
                <div class="container">
                    <%@ include file="./mypageheader.jsp" %>
                    <div class="mypage-card-header mt-3 ">
                        <div class="row">
                            <div class="col-12">
                                <h2 class="font-weight-bold">예매내역</h2>
                            </div>
                        </div>
                    </div>
                    <div class="card mt-3">
                        <div class="card-body">
                            <div class="row">
                                <div class="col-3">
                                    <img style="width: 200px; height: 200px;"
                                         src="/resources/sample-images/${performance.imagePath}"
                                         class="rounded float-left" alt="...">
                                </div>
                                <div class="col-9">
                                    <div class="row">
                                        <div class="col-12">
                                            <div class="row">
                                                <div class="col-12">
                                                    <h1 class="font-weight-bolder">${performance.title} </h1>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-12">
                                            <div class="row">
                                                <div class="col-6">
                                                    <div class="row">

                                                        <div class="col-12">
                                                            <i class="fas fa-star"></i> <span>예매날</span>
                                                            <div>
                                                                <span><fmt:formatDate value="${reserve.regDate}"
                                                                                      pattern="yyyy.MM.dd"/></span>
                                                            </div>
                                                        </div>
                                                        <div class="col-12">
                                                            <i class="far fa-calendar-alt"></i> <span>관람일</span>
                                                            <div>
                                                                <span><fmt:formatDate value="${performance.startDate}"
                                                                                      pattern="yyyy.MM.dd"/></span>
                                                                <span>~</span>
                                                                <span><fmt:formatDate value="${performance.endDate}"
                                                                                      pattern="yyyy.MM.dd"/></span>
                                                            </div>
                                                        </div>
                                                        <div class="col-12">
                                                            <i class="fas fa-ticket-alt"></i> <span>티켓번호</span>
                                                            <div>
                                                                <span>${mate.seatGroup}${mate.seatRate}<fmt:formatDate
                                                                        value="${reserve.regDate}"
                                                                        pattern="MMdd"/></span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-6">
                                                    <div class="row">
                                                        <div class="col-12">
                                                            <i class="fas fa-map-marker-alt"></i><span>공연장</span>
                                                            <div>
                                                                <span>${hall.name}</span>
                                                            </div>
                                                        </div>
                                                        <div class="col-12">
                                                            <i class="fas fa-user"></i> <span>예매자</span>
                                                            <div>
                                                                <span>${reserve.reserveUser.nickname}</span>
                                                            </div>
                                                        </div>
                                                        <div class="col-12">
                                                            <i class="fas fa-arrow-alt-circle-right"></i>
                                                            <span>예매상태</span>
                                                            <div>
                                                                <span>${reserve.status}</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- 나와함께한 메이트 -->
                    <div class="mypage-card-header mt-3 ">
                        <div class="row">
                            <div class="col-12">
                                <h2 class="font-weight-bold">메이트 티켓</h2>
                            </div>
                        </div>
                    </div>
                    <div class="card mt-3">
                        <div class="card-body" style="margin: 0 auto;">
                            <div class="item" style="border: 1px solid black;">
                                <div class="item-right">

                                    <h2 class="num"><fmt:formatDate value="${performance.schedule.get(0).showDate}"
                                                                    pattern="MM-dd"/></h2>
                                    <p class="day"><fmt:formatDate value="${performance.schedule.get(0).showDate}"
                                                                   pattern="E"/>요일</p>
                                    <i class="fas fa-barcode fa-9x"></i>

                                    <span class="up-border"></span> <span class="down-border"></span>
                                </div>
                                <!-- end item-right -->

                                <div class="item-left">
                                    <div class="row">
                                        <div class="col-12">
                                            <h2 class="title">${mate.category}</h2>
                                            <div class="event text-primary text-truncate mt-2">
                                                <c:forEach items="${mate.mateTags}" var="tag" begin="0" end="2"
                                                           step="1">
                                                    <span>${tag.tagName}</span>
                                                </c:forEach>
                                                <c:if test="${mate.mateTags.size() >= 3}">
                                                    <span>...</span>
                                                </c:if>
                                            </div>
                                            <div class="mt-5 text-muted	"
                                                 style="border-bottom: 1px solid gray;">
                                                <i class="fas fa-flag"></i> 인원 <span
                                                    class="ml-2">${mate.mateMembers.size()}</span>
                                                <span>/</span> <span>${mate.groupsize}</span>
                                            </div>

                                            <div style="border-bottom: 1px solid gray;">
                                                <div class="text-muted">
                                                    <i class="fas fa-user-friends"></i> 참여자 :
                                                    <c:forEach items="${mate.mateMembers}" var="member">
                                                        <span>${member.nickname}</span>
                                                    </c:forEach>
                                                </div>
                                                <div></div>
                                            </div>
                                            <div class="fix"></div>
                                            <div class="loc">
                                                <div class="text-muted">
                                                    <i class="fas fa-couch"></i> 좌석번호 :
                                                    <c:forEach
                                                            items="${fn:split(mate.seatGroup, fn:substring(mate.seatGroup,0 ,1 ))}"
                                                            varStatus="now" var="seatno">
                                                        <span>${fn:substring(mate.seatGroup,0 ,1 )}${seatno}</span>
                                                        <c:if test="${now.count eq 1}">
                                                            <span> ~ </span>
                                                        </c:if>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>

                                <!-- end item-right -->
                            </div>
                            <div class="fix"></div>
                        </div>
                    </div>
                    <!-- 나와함께한메이트 -->
                    <!--  구매내역 -->
                    <div class="mypage-card-header mt-3 ">
                        <div class="row">
                            <div class="col-12">
                                <h2 class="font-weight-bold">구매내역</h2>
                            </div>
                        </div>
                    </div>
                    <div class="card mt-3">
                        <div class="card-body">
                            <table class="table table-borderless">
                                <colgroup>
                                    <col width="30%"/>
                                    <col width="30%"/>
                                    <col width="40%"/>
                                </colgroup>
                                <tbody>
                                <tr style="border-bottom: 1px solid black;">
                                    <th class="h3 font-weight-light">티켓금액</th>
                                    <td><i class="fas fa-equals fa-2x"></i></td>
                                    <td><h3>${payment.pay}</h3></td>
                                </tr>
                                <tr>
                                    <th>기본가</th>
                                    <td><i class="fas fa-plus"></i></td>
                                    <td>${reserve.seatPrice}</td>
                                </tr>
                                <tr>
                                    <th>주문 수수료</th>
                                    <td><i class="fas fa-plus"></i></td>
                                    <td>1000</td>
                                </tr>
                                <tr>
                                    <th>쿠폰할인</th>
                                    <td><i class="fas fa-minus"></i></td>
                                    <td>${payment.couponValue}</td>
                                </tr>
                                <tr>
                                    <th>포인트사용</th>
                                    <td><i class="fas fa-minus"></i></td>
                                    <td>${payment.usedPoint}</td>
                                </tr>
                                <tr>
                                    <th>총 할인금액</th>
                                    <td><i class="fas fa-equals"></i></td>
                                    <td>${payment.couponValue + payment.usedPoint}</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- 구매내역 end -->
                    <!-- 결제 내역 -->
                    <div class="mypage-card-header mt-3 ">
                        <div class="row">
                            <div class="col-12">
                                <h2 class="font-weight-bold">결제내역</h2>
                            </div>
                        </div>
                    </div>
                    <div class="card mt-3">
                        <div class="card-body">
                            <table class="table table-borderless">
                                <tbody>
                                <tr>
                                    <th>결제방법</th>
                                    <td>카드</td>
                                </tr>
                                <tr>
                                    <th>카드명</th>
                                    <td>KB국민카드/467309**********</td>
                                </tr>
                                <tr>
                                    <th>할부</th>
                                    <td>일시불</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- 결제내역 end -->
                    <!-- 유의사항  -->
                    <div class="mypage-card-header mt-3 ">
                        <div class="row">
                            <div class="col-12">
                                <h2 class="font-weight-bold">유의사항</h2>
                            </div>
                        </div>
                    </div>
                    <div class="card mt-3">
                        <div class="card-body m-2 text-monospace" style="font-size: 0.7rem;">
                            <p class="text-muted text-left">취소마감시간 이후 또는 관람일 당일 예매하신 건에 대해서는 취소/변경/환불이
                                불가합니다. <br/> 예매수수료는 예매 당일 밤 12시 이전까지 취소 시 환불 가능합니다. <br/> 배송이 시작된 경우
                                취소마감시간이전까지 멜론티켓 고객센터로 티켓을 반환해주셔야 환불이 가능하며, 도착한 일자 기준으로 취소수수료가
                                부과됩니다. <br/>(* 단, 반환된 티켓의 배송료는 환불되지 않으며 일괄배송 상품의 경우 취소에 대한 자세한 문의는
                                고객센터로 문의해 주시기 바랍니다.) <br/>지역 및 배송서비스 사정에 따라 배송사가 변경될 수 있으며, 배송일이
                                추가적으로 소요될 수 있습니다. (CJ대한통운, 우체국 외 1개 업체) <br/>일괄배송의 경우 공연 별로 배송일자가
                                상이하며 지정된 배송일자 기준으로 배송이 시작됩니다. <br/>(* 지정된 배송일자는 상세정보 및 예매공지사항에서 확인할 수
                                있습니다.) 구매한 모바일티켓을 타인에게 전달한 경우, 구매자 본인에게 티켓이 회수된 후에 예매취소가 가능합니다.<br/>
                                예매취소 시점과 결제 시 사용하신 신용카드사의 환불 처리기준에 따라 취소금액의 환급방법과 환급일은 다소 차이가 있을
                                수 있습니다.<br/> 신용카드 할부결제로 구매하신 과티켓 수량의 일부를 취소하실 경우, 신용카드사의 사정에 따라
                                혜택(무이자 할부 등)의 적용 여부가 달라질 수 있음을 유의하시기 바랍니다.<br/> 기타 문의사항은 이용안내를 참조하시거나
                                고객센터 1899-0042 혹은 1:1문의를 이용하시기 바랍니다.</p>
                        </div>
                    </div>

                    <!-- 유의사항 end -->
                </div>
            </div>
        </div>
        <div class="footer">
            <%@ include file="../common/footer.jsp" %>
        </div>
    </div>
</div>
</body>
</html>