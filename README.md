# Java University Project with Stripe Integration

![License](https://img.shields.io/badge/License-MIT-blue.svg)
![Java](https://img.shields.io/badge/Java-11%2B-orange)
![Stripe API](https://img.shields.io/badge/Stripe-API%20v3-blue)

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Project Overview

This project is a **Java-based web application** designed as part of a university project. The main functionality includes basic CRUD operations and payment processing via the **Stripe API**. The project follows the **REST API** architecture to allow seamless integration of backend services with external clients. 

The payment system uses **Stripe**, a secure payment processor, to handle transactions, making the project suitable for e-commerce or donation platforms.

## Features

- **RESTful API**: Provides endpoints for various CRUD operations.
- **Stripe Integration**: Process payments using Stripe's secure payment gateway.
- **User Management**: Create, update, retrieve, and delete users.
- **Product Management**: Add, update, retrieve, and delete products.
- **Order Management**: Create and retrieve orders with payment integration.
- **Secure Transactions**: Payments are processed through Stripe with tokens for security.
  
## Technologies Used

- **Java 11+**: Core programming language.
- **Spring Boot**: Framework for building the RESTful API.
- **Stripe API**: Used for payment processing.
- **Maven**: Dependency management and build automation.
- **H2 Database** (or any other): For local development and testing.
- **Postman**: For API testing.
- **JSON**: Data format for communication between the server and clients.

## Setup and Installation

### Prerequisites

- **Java 11+** installed
- **Maven** for dependency management
- A **Stripe account** for payment integration
- IDE like **IntelliJ IDEA** or **Eclipse** for running the project

### Clone the Repository

```
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### Install Dependencies

Run the following command to install all the required dependencies:

```
mvn clean install
```

### Run the Application

To start the application, use the following command:

```
mvn spring-boot:run
```

By default, the application runs on `http://localhost:8080`.

## Configuration

### Stripe API Keys

Before running the project, you need to configure your **Stripe API keys**. Create a `application.properties` file (or use environment variables) in the `src/main/resources` folder and add the following:

```
stripe.apiKey=your_stripe_secret_key
stripe.publicKey=your_stripe_publishable_key
```

You can obtain these keys from your [Stripe Dashboard](https://dashboard.stripe.com/).

### Database Configuration

By default, the project uses an in-memory H2 database for testing. You can configure a persistent database by editing the `application.properties` file:

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## Usage

You can interact with the API using tools like **Postman** or **cURL**. Below are the key functionalities provided by the application:

1. **Create Users**
2. **Manage Products**
3. **Create Orders**
4. **Process Payments using Stripe**

### Example Request for Creating a Payment:

```
POST /api/payment/charge
Content-Type: application/json
{
  "amount": 5000,
  "currency": "usd",
  "source": "tok_visa",  // This is a test token provided by Stripe
  "description": "Test Payment"
}
```

### Example Response:

```
{
  "status": "succeeded",
  "balance_transaction": "txn_xxxxxxxxx",
  "id": "ch_xxxxxxxxxxxxx",
  "amount": 5000,
  "currency": "usd"
}
```

## API Endpoints

| Method | Endpoint             | Description                    |
|--------|----------------------|--------------------------------|
| GET    | `/api/products`       | Retrieve all products          |
| POST   | `/api/products`       | Create a new product           |
| GET    | `/api/users`          | Retrieve all users             |
| POST   | `/api/users`          | Create a new user              |
| POST   | `/api/payment/charge` | Process a payment using Stripe |

> You can find detailed documentation for each API in the [API Docs](./API_DOCUMENTATION.md).

## Testing

You can run unit tests and integration tests using **Maven**. To execute all tests, run:

```
mvn test
```

For testing API endpoints, tools like **Postman** or **cURL** can be used to simulate requests and verify responses.

## Contributing

Contributions are welcome! Here's how you can contribute:

1. Fork the repository.
2. Create a new branch for your feature or bugfix: `git checkout -b feature-name`.
3. Commit your changes: `git commit -m 'Add new feature'`.
4. Push to the branch: `git push origin feature-name`.
5. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for more details.

## Contact

If you have any questions or suggestions about the project, feel free to contact me:

- **Email**: your-email@example.com
- **GitHub**: [your-username](https://github.com/your-username)
