# Mentor Management System

The Mentor Management System is an application that provides a REST API for creating, retrieving, updating, and deleting mentor records.

## Prerequisites
- Java 8 or higher
- Spring Boot
- Lombok
- Maven or Gradle

## Installation
1. Clone the repository.
2. Import the project into your preferred IDE.
3. Build the project to resolve dependencies.

## Usage
The Mentor Management System provides the following REST API endpoints for managing mentors:

### Create Mentor
- Endpoint: `POST /api/mentors`
- Description: Creates a new mentor.
- Request Body: Mentor object in JSON format.
- Response: Returns the created mentor object.

### Get Mentor by ID
- Endpoint: `GET /api/mentors/{id}`
- Description: Retrieves a mentor by their ID.
- Path Variable: `id` - ID of the mentor.
- Response: Returns the mentor object with the specified ID.

### Get All Mentors
- Endpoint: `GET /api/mentors`
- Description: Retrieves all mentors.
- Response: Returns a list of all mentor objects.

### Update Mentor
- Endpoint: `PUT /api/mentors/{id}`
- Description: Updates an existing mentor.
- Path Variable: `id` - ID of the mentor to update.
- Request Body: Mentor object in JSON format.
- Response: Returns the updated mentor object.

### Delete Mentor
- Endpoint: `DELETE /api/mentors/{id}`
- Description: Deletes an existing mentor.
- Path Variable: `id` - ID of the mentor to delete.
- Response: Returns a success message.

## Running the Application
1. Build and run the application using your preferred IDE or command line tools.
2. Access the REST API endpoints using the provided URLs and HTTP methods.

