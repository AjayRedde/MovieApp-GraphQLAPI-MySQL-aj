**Movie Recommendation GraphQL Service backend application**
This is a GraphQL-based movie recommendation service built using Spring Boot WebFlux. 
I created this project out of my interest in exploring __reactive programming, GraphQL APIs, and database integration with MySQL__.

**I built this project to:**
Learn and experiment with __GraphQL APIs__.
Deepen my understanding of __Spring WebFlux__ and __reactive programming__.
Explore database connectivity with __R2DBC__.
Work on a personal interest topic: movies and recommendations __(e.g., Prime and Netflix)__.

**The project serves as a platform for:**
Fetching detailed movie information, user profiles, and movie reviews via __GraphQL queries__.
Managing watchlists and user profiles using __GraphQL mutations__.
Demonstrating reactive programming with __Spring WebFlux and R2DBC for scalable and non-blocking operations__.

#CONGIGURE ALL THE PROPERTIES AT __application.xml__ for DB, localhost, and Debbeger for Logs.

server: port: 8080 # Application will run on port 8080

R2DBC:url: r2dbc:mysql://localhost:3306/graphql_demo # Reactive database connection URL
      username: ${DB_USERNAME} 
      password: ${DB_PASSWORD} 

  datasource:
    url: jdbc:mysql://localhost:3306/graphql_Movie-application
    username: ${DB_USERNAME}
    password: ${DB_PASSWORD}
    driver-class-name: com.mysql.cj.jdbc.Driver
    
jpa:
    hibernate:ddl-auto: update # Automatically update the schema
    show-sql: true # Enable SQL query logging
    
graphql:graphiql:enabled: true
path: /graphiql # Accessible at http://localhost:8080/graphiql

logging: level: org.springframework: INFO
