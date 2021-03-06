# Spring Boot Validation

* Validation이란, 오류가 생기기 전에 미리 검증하는 과정.

1. 검증 해야 할 값이 많은 경우 코드의 길이가 길어진다
2. 구현에 따라서 달라 질 수 있지만 Service Logic과의 분리가 필요
3. 흩어져 있는 경우 어디에서 검증을 하는지 알기 어려우며, 재사용의 한계가 있다.
4. 구현에 따라 달라 질 수 있지만, 검증 Logic이 변경 되는 경우 테스트 코드 등 참조하는 클래스에서 Logic이 변경되어야 하는 부분이 발생할 수 잇다.


## Validation Annotation

* @Size : 문자 길이 측정 (Int Type 불가)
* @NotNull : null 불가
* @NotEmpty : null, "" 불가
* @NotBlank : null, "", " " 불가
* @Past : 과거 날짜
* @PastOrPresent : 오늘이거나 과거 날짜
* @Futrue : 미래 날짜
* @FutureOrPresent : 오늘이거나 미래 날짜
* @Pattern : 정규식 적용
* @Max : 최대값
* @Min : 최소값
* @AssertTrue/False : 별도 logic 적용
* @Valid : 해당 object validation 실행


## gradle dependencies

1. implementation("org.springframework.boot:spring-boot-starter-validation")

2. bean validation spec
   * https://beanvalidation.org/2.0-jsr380/ 

# Spring Boot Custum Validation


1. AssertTrue / False와 같은 method 지정을 통해서 Custom Logic 적용 가능
2. ConstraintValidator를 적용하여 재사용이 가능한 Custom Logic 적용 가능

* List< Car > 같은 객체 인 경우에는 @Valid 어노테이션을 붙여야 Car 클래스 안의 어노테이션이 작동한다.  


# Exception처리

* Web Application의 입장에서 바라 보았을 때, 에러가 났을 때 내려줄 수 있는 방법은 많지 않다.

1. 에러페이지

2. 4xx Error or 5xx Error

3. Client가 200외에 처리를 하지 못 할 때는 200을 내려주고 별도의 에러 Message 전달 

### 어노테이션

* @ControllerAdvice : Global 예외 처리 및 특정 package / Controller 예외 처리

* @ExceptionHandler : 특정 Controller의 예외 처리 

# Filter

* Filter란 WebApplication에서 관리되는 영역으로써 스프링 프레임워크에서 Client로 부터 오는 요청/응답에 대해서 최초/최종 단계의 위치에 존재하며, 이를 통해서 요청/응답의 정보를 변경하거나, Spring에 의해서 데이터가 변환되기 전의 순수한 Client의 요청/응답 값을 확인할 수 있다.

* 유일하게 ServletRequest, ServletResponse의 객체를 변환할 수 있다

* 주로 스프링 에서는 request / response의 Logging용도로 활용하거나, 인증과 관련된 Logic들을 해당 Filter에서 처리한다

* `이를 선/후 처리함으로써, Service business logic과 분리 시킨다 `

# Interceptor

* Interceptor란 Filter와 유사한 형태로 존재 하지만, 차이점은 Spring Context에 등록된다.
* AOP와 유사한 기능을 제공할 수 있으며, 주로 인증 단계를 처리하거나 logging을 하는데에 사용된다. 이를 선/후 처리 함으로써, Service business logic과 분리 시킨다. 


# Server - to - Server 연동

