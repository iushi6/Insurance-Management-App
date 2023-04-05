# Insurance-Management-App
Application for Insurance Management System

1. Structure :

├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.insurance
│   │   │   │   ├── config
│   │   │   │   │   └── SecurityConfig.java
│   │   │   │   ├── controller
│   │   │   │   │   ├── ClaimController.java
│   │   │   │   │   ├── ClientController.java
│   │   │   │   │   ├── HomeController.java
│   │   │   │   │   └── InsurancePolicyController.java
│   │   │   │   ├── model
│   │   │   │   │   ├── Claim.java
│   │   │   │   │   ├── Client.java
│   │   │   │   │   ├── InsurancePolicy.java
│   │   │   │   │   ├── JwtRequest.java
│   │   │   │   │   ├── JwtResponse.java
│   │   │   │   │   ├── Role.java
│   │   │   │   │   ├── User.java
│   │   │   │   │   └── UserRole.java
│   │   │   │   ├── repository
│   │   │   │   │   ├── ClaimRepository.java
│   │   │   │   │   ├── ClientRepository.java
│   │   │   │   │   ├── InsurancePolicyRepository.java
│   │   │   │   │   └── UserRepository.java
│   │   │   │   ├── service
│   │   │   │   │   ├── ClaimService.java
│   │   │   │   │   ├── ClientService.java
│   │   │   │   │   ├── InsurancePolicyService.java
│   │   │   │   │   ├── JwtUserDetailsService.java
│   │   │   │   │   ├── UserService.java
│   │   │   │   │   └── impl
│   │   │   │   │       ├── ClaimServiceImpl.java
│   │   │   │   │       ├── ClientServiceImpl.java
│   │   │   │   │       ├── InsurancePolicyServiceImpl.java
│   │   │   │   │       └── UserServiceImpl.java
│   │   │   │   ├── InsuranceManagementApplication.java
│   │   │   │   └── utils
│   │   │   │       ├── JwtTokenUtil.java
│   │   │   │       └── UserDTO.java
│   │   │   └── resources
│   │   │       ├── application.properties
│   │   │       ├── data.sql
│   │   │       ├── static
│   │   │       └── templates
│   │   └── resources
│   │       └── test
└── pom.xml

In this structure, we have separate packages for configuration (config), controllers (controller), models (model), repositories (repository), and services (service). Additionally, we have a package for utility classes (utils). The InsuranceManagementApplication class is the main entry point for the Spring Boot application, and the application.properties file contains configuration properties for the application.


#NOTE : Although this project is in progress you can checkout the latest code in branch "asaxena_final approach".

THANKS FOR VISIT !!!
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
