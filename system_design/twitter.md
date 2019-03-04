# Twitter

## Clarify the problem

* Features
  * Tweeting (posting a tweet)
  * Timeline - where you see other people's tweet
    * User Time-lineYour own timeline - you see here own tweets and the tweets that you have re-twitted
    * Home timeline - all the tweets from the people you follow and merge them in chronological order.
  * Following - other people whome you want to follow
* Have a good understanding of this service

Relational DB -

* User table - user_id, name
* tweet table - tweet_id, user_id, content
* follower table

It is *Read-Heavy*

* More read operations - visiting home timeline more often
* less writing operations - tweeting less

What do you care about:

* More about availability
* less about consistency

## Tweeting

* Your request will first go to the Load Balancer, it will be routed to some server.
* The server is nothing but redis clusters (in-memory DB type of thing)
* When you tweet, then all the people that follows you, their timeline will get refreshed.
* Twitter keeps 3 different replicas of all the people that follow you in memory.
* When very famous people like celebrities tweet, then this apprach is not followed, and when you load your timeline they are fetched from RDBMS.
* So it's essentially mix of in-memory DB and relational DB.