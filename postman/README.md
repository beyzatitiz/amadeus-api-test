# amadeus-api-test
This repository contains a simple Postman collection used to test the Flight Search Application. This collection sends a GET request to retrieve flight data from the Flight Search Application and verifies that the response is in the correct format.

## Tests
- Tested whether GET requests return a 200 status code.
- Tested whether the content of the responses is in the correct format.
- Tested that the response from GET requests contains a "Content-Type" header with the value "application/json."

## How to Use?
If not already installed, first download and install Postman (https://www.postman.com/downloads/).

Open Postman and import the collection:

1. Click the "Import" button in the top toolbar.
2. Select the "Import From Link" option.
3. In the pop-up window, paste the GitHub URL of this collection into the "Enter a URL" field: <Your GitHub Repository URL>
4. Click the "Import" button to import the collection.
5. Select the collection and execute the request named "Get Flights." This request will send a GET request to the Flight Search Application and verify the response.