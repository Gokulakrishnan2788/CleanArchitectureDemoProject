# Project Specification

## Project Name

CleanArchitectureDemoProject

---

# Objective

Demonstrate modular Android architecture using:

- Clean Architecture
- Jetpack Compose
- Hilt Dependency Injection
- Navigation Compose

---

# Functional Requirements

## Posts List Screen

The application must:

- Fetch posts from remote API
- Display posts in a scrollable list
- Show title and body

---

## Post Detail Screen

When a user taps a post:

- Navigate to detail screen
- Display selected post ID
- Provide back navigation

---

# API Source

Posts are retrieved from:

https://jsonplaceholder.typicode.com/posts

---

# Architecture Requirements

The project follows **Clean Architecture** principles.

Layers:

Presentation  
↓  
Domain  
↓  
Data

---

# Use Case

Primary use case:

GetPostsUseCase

Responsibilities:

- Fetch posts from repository
- Return domain models

---

# Navigation Flow

Posts List  
↓  
Post Detail

Route pattern:

postDetail/{postId}

---

# Technical Constraints

- Kotlin
- Jetpack Compose
- Hilt Dependency Injection
- Navigation Compose
- Retrofit

---

# Author
Gokulakrishnan Mani
Android Architect  
