# REST vs SOAP

## SOAP

Simple object access protocol

Transfer soap object in xml format over HTTP and use those objects.

### why do you need soap/REST

* communication over internet - transfer data from one website to another
* Soap message
* WSDL format for communication between sender and receiver

## REST

Representational State transfer

| Characteristics | SOAP | REST |
|:----:|:----:|:-----:|
| Message protocol | XML based message protocol | architectural style (desing that uses existing protocols for communication) |
| What is exposed | SOAP exposes behavior | REST exposes resource |
| Communication format | WSDL (web-service description language) | XML or JSON messages |
| Invocation strategy | Invokes service by haing RPC calls | calls service via URL pathing |
| Performance | performance is not great compared to rest | performance is great - less CPU intensive |
| Message readability | not much readable | good message readability |
|| Message is heavy weight | message is light weight |