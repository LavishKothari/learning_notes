# Tiny URL

## Question

* User gives a long URL then your system needs to return a short URL.
* User gives the short URL and you need to give the original long URL.

What interviewer is looking for:

* Scalability
* Durability

### API

`createTinyURL(String longURL)` and `getOriginalURL(String shortURL)`

### Application Layer

* How do you generate a tiny URL that is 
  * unique
  * random enough

* REST service
* Load Balancer
* Worker threads 

### What all characters you can have in your TinyURL

`a-z`, `A-Z` and `0-9`.

### How many characteres in your TinyURL

7 characters = 62^7 = 3.5*10^12

### how to generate TinyURL

* Can you use a hash-function?
* Can you use incremental-counters (no-randomness present) what about reverse mapping?
* Worker can generate random numbers in a range to get rid of collistion among workders

## Questions

* Do you want same URL to be generated everytime you query the system for a tinyURL?
* Caching
  * Distributed Cache
  * Location based cache - CDN (Content delivery networks)
* Global Usage

## Persistant storage

* Approach 1 - get the tiny url from the database, if it doesn't exists put
  * You can get into concurrency issues if there are many worker threads that are accessign the database concurrently
* Approach 2 - `putIfAbsent` type of operation that is natively supported by DB. (Many relational DB support this natively, but no-sql dbs don't. Relational DBs don't scale well, but no-sql dbs scale well)
* Approach 3 - Generate a random key and then put in DB if not already present, Once you put, again do a get and confirm that your key-value pair is correctly present in DB


