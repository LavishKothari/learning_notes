# Scaling

* horizontal scaling
* vertical scaling

| Horizontal Scaling | Vertical Scaling |
|------|-----|
| Multiple machines serving the same functionality | One single big powerful machine serving the functionality |
| Resilient | Single point of failure |
| Network Call amonst all the different machines (RPC) | IPC - InterProcess communication |
| Data consistency issues | data is always consistent |
| Scales well | Hardware limit |

## What is used in the real world

A combination/hybrid of both the above techniques is used.

* Each machine is as big as possible
* Scalable
* resilient
* consistent