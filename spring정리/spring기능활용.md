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
