# API Specification

## Register
### Request:
- Method: POST
- Endpoint: `/api/register`
- Body:
```json
{
  "username": "string|unique",
  "password": "string|minimum 6 character",
  "password_confirmation": "string|minimum 6 character",
  "name": "string",
  "email": "string|unique",
  "address": "text"
}
```
#### Response: 
```json
{
  "username": "string|unique",
  "password": "string|minimum 6 character",
  "password_confirmation": "string|minimum 6 character",
  "name": "string",
  "email": "string|unique",
  "address": "text"
}
```
## Login

### Request:
- Method: POST
- Endpoint: `/api/login`
- Body:
```json
{
  "username": "string",
  "password": "string"
}
```
### Response:
```json
{
  "username": "string",
  "name": "string",
  "email": "string",
  "address": "text"
}
```
