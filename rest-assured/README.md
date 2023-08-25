# Flight Search Application API Tests

This repository contains API tests for the **Flight Search Application** using the Rest-Assured library. The tests are designed to ensure the correctness and reliability of the API's endpoints.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Test Descriptions](#test-descriptions)
- [Docker Support](#docker-support)
- [License](#license)

### Prerequisites

- Java JDK 20
- Maven 3.9

### Installation

1. Clone this repository to your local machine:

   ```sh
   git clone https://github.com/beyzanurtitiz/flight-search-api-tests.git
   cd flight-search-api-tests
   mvn install
   ```
2. Install the required dependencies using Maven:
   ```sh
   mvn install
   ```

## Running Tests

You can run the API tests using the following command:

```sh
mvn test
```

## Test Descriptions

### 1. check_response_status()

This test ensures that GET requests to the API return a status code of 200 (OK).

### 2. check_response_body()

This test verifies that the response body from the API is correctly formatted according to the defined schema. The schema file used to validate the response body can be found at `src/test/resources/flights-schema.json`.

### 3. check_response_header_test()

This test checks that the "Content-Type" header in the API response is present and has a value of "application/json".

## Docker Support

A Dockerfile is provided in this repository, allowing you to containerize the API tests.

1. Build the Docker image:

   ```sh
   docker build -t flight-api-tests .
   ```
2. Run the tests in a Docker container:
    ```sh
   docker run flight-api-tests
   ```
## License

This project is licensed under the [MIT License](LICENSE).