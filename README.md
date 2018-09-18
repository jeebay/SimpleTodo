# Pre-work - *Simple ToDo App*

**Simple ToDo** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Brian Johnson**

Time spent: **3.5** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://www.giphy.com/gifs/1d5Qn3s9A3JKNz8WZy' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [Giphy Capture](https://giphy.com/apps/giphycapture).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:**

It's impressive how self-contained the Android platform is, with the build tool, layout and business logic seamlessly integrated. WYSIWYG editors for web fell out of favor years and years ago, seemingly never to return so it's interesting to see that as the primary layout tool.

Along with the tightly integrated development environment, I love how easy it is to download and run additional images. Looking forward to seeing the debugging tools.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:**

The ArrayAdapter appears to take a collection and return an interface for modifying the collection while managing the instantiation and lifecycle of views associated with each item in the collection.

The Adapter is important because the developer gets to interact with an interface that looks a lot like a normal Array or collection but that has the side effect of updating the view. This could be particularly helpful when it comes to arbitrary insertions or deletions and not having to worry about updating the view or disposing of old objects.

`convertView` seems to be a way of passing a view that's alread been instantiated (or inflated?) so that it can be reused and just have its `text` property set via `setText`. If creating new views is expensive then reusing a pool of views for lists or tables could save a lot of cycles. In the web there's a technique called "windowing" that reuses existing DOM nodes and sets their inner content to imitate scrolling or pagination with minimal DOM mutations.

## Notes

Describe any challenges encountered while building the app.

**Answer:**

So far, nothing too challenging but I haven't implemented the **optional** features yet. Java appears to have very different scoping rules compared to JavaScript or Python where `this` or `self` is required to access fields on the instance. I'm amazed at how much seems to be in scope with very few lines of code and can see this becoming confusing.

## License

    Copyright 2018 Brian Johnson

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
