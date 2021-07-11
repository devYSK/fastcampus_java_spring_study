# Swagger란

* 개발한 Rest API를 편리하게 문서화 해주고, 이를 통해 관리 및 제 3의 사용자가 편리하게 API를 호출해보고 테스트 할 수 있는 프로젝트.

* Spring Boot에서는 간단하게 springfox-boot-starter를 ㅎradle dependencies에 추가 함으로 사용할 수 있다.

* 다만, 주의할 점은 운영환경과 같은 외부에 노출되면 안되는 곳에는 사용할 땐 주의 해야 한다.


## Swagger 어노테이션

* @Api : 클래스를 스웨거의 리소스로 표시
* @ApiOeration : 특정 경로의 오퍼레이션 HTTP 메소드 설명

* @ApiParam : 오퍼레이션 파라미터에 대한 메타데이터 설명

* @ApiResponse : 오퍼레이션의 응답 지정
* @ApiModelProperty : 모델의 속성 데이터를 설명
* @ApiImplicitParam : 메소드 단위의 오퍼레이션 파라미터를 설명

