# SQL or NOSQL

## SQL Structured Quers Language

`SELECT name, id, price FROM products WHERE price >= 100`

* In SQL world, we will have strict schema for tables - this schema is defined by fields
* It's not possible to have different number of Columns for different rows in SQL
* You normalize the tables - removing redundant information that you store in DB

You can have multiple tables:

* Users table
* Product table (a product could be created by a user)
* Orders table (a user can place an order for multiple products)

`Users` Table

| ID | Name| email |
|:----:|:----:|:----:|
| ... | ... | ... |
| ... | ... | ... |
| ... | ... | ... |

`Product` Table

| ID | Name| Price | Description |
|:----:|:----:|:----:|:----:|
| ... | ... | ... | ... |
| ... | ... | ... | ... |
| ... | ... | ... | ... |

`Orders` Table (One to many relationship as one user can have multiple orders)

| Order ID| User ID | Product ID |
|:----:|:----:|:----:|
| ... | ... | ... |
| ... | ... | ... |
| ... | ... | ... |



### One to one relationship

`Users` Table

| ID | Name| age | contact ID |
|:----:|:----:|:----:|:----:|
| ... | ... | ... | ... |
| ... | ... | ... | ... |
| ... | ... | ... | ... |

`Contact` table

| Contact ID | User ID | E-mail | Address | Phone Number |
|:----:|:----:|:----:|:----:|:----:|
| ... | ... | ... | ... | ... |
| ... | ... | ... | ... | ... |
| ... | ... | ... | ... | ... |

There exists one-to-one relationship between contact table and the user table - One user can have only one entry in the contact table.

### Many to many relation

`Users` Table

| ID | Name| email |
|:----:|:----:|:----:|
| ... | ... | ... |
| ... | ... | ... |
| ... | ... | ... |

`Roles` table

| ID | title | rights |
|:----:|:----:|:----:|
| ... | ... | ... |
| ... | ... | ... |
| ... | ... | ... |

to create many-to-many relationship we introduce one more table called User-Role table

`User-Role` table

| User_ID | Role_ID |
|:----:|:----:|
| ... | ... |
| ... | ... |
| ... | ... |

### Characteristics of SQL

* Strict Schema
* Relation between differnet table

## NOSQL

Example MongoDB - used to store lots and lots of data in efficient way

`Shop` **database** is having **Collections** like `Users` and `Orders`. Each collection contains **Documents** like `{id:1, name:'ABC',email:'abc@gmail.com'}` and `{id:1, name:'ABC',phone:'+91-9456123478'}`

### Advantages:

* Flexible
* Efficient
* You get the data that you need in each collection

### Disadvantages:

* Duplication of data

**NOSQL is great for lot of reads and less updates or writes.**

| Characteristics | SQL | NOSQL |
|:----:|:----:|:----:|
| Flexibility | not so flexible | flexible |
| Predictable layout | Yes | No |
| Frequent changes | Difficult | frequent changes can be done easily |
| Data distributed in multible tables | yes | no |
| Horizontal Scaling | Not supported (Immpossible or very hard) | both horizontal and vertical scaling is possible |
| Schema | Schema-ful | Schemaless |
| Duplication | can be removed using normaliztion | high duplication factor |
| Performance | not so good as you might need to perform big joins (write efficient) | efficient in terms of reading (read-efficient and not for update operations) |