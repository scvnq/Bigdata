# Twitter Abusive Behavior identification

## LINKS:
Project link:https://github.com/scvnq/Bigdata
Slides:https://docs.google.com/presentation/d/1mgaWAuQ0ZW9BwzCfwUROizDhB8TOmHcCXwPOAGzBmoo/edit?usp=sharing
Report:https://docs.google.com/document/d/1xG3KK312NSgQaPDSO6lrFRS3DC6rS6TLY8pvj3Ml3Os/edit?usp=sharing
WIKI:https://github.com/scvnq/Bigdata/wiki/Final-Project

## 1 Motivation
There exists a lot of abusive messages on the Internet which can be harmful to people. In order to reduce this kind of messages, we need a filter to detect if a tweet is abusive by considering its content. We want to use a large set of tweets which contains both abusive and non-abusive ones to train a model, so that we can use the model to predict if a tweet is abusive or not.

## 2 Significance
In this project we want to detect abusive tweets so that we can build a filter to ignore them, in order to improve the experience of user.

## 3 Objectives

1.Clean the dataset we got for the twitter. We remove the links, null value and repeat columns .

2.Use MapReduce.

3.Implement some queries using Apache Spark and Hive.

4.Visualizations

5.Use a large set of tweets as a training set, to build a model which is able to identify abusive tweets.

## 4 Features

Because we use a large dataset as training set, it can be accurate to identify abusive tweets. The features of our project will include the classification of tweets. When the user input some words or a sentence, the system can identify whether it is an abuse or a non-abuse based on the keyword.

Ignore abuse tweets by filter.
