# CleanArchitectureDemoProject

This project demonstrates **Android Clean Architecture using Jetpack Compose** with a modular project structure.

---

# Tech Stack

- Kotlin
- Jetpack Compose
- Clean Architecture
- MVVM
- Hilt Dependency Injection
- Navigation Compose
- Retrofit
- Version Catalog (libs.versions.toml)

---

# Project Modules

app  
presentation  
domain  
data

---

## app

Application entry point.

Responsibilities:

- App startup
- Navigation graph
- Dependency injection setup

Example:

AppNavGraph  
MyApp (Application class)

---

## presentation

UI layer.

Responsibilities:

- Jetpack Compose screens
- ViewModels
- UI state

Example:

PostsRoute  
PostsScreen  
PostsViewModel  
PostDetailScreen

---

## domain

Business logic layer.

Responsibilities:

- Domain models
- Use cases
- Repository interfaces

Example:

Post  
PostsRepository  
GetPostsUseCase

---

## data

Data implementation layer.

Responsibilities:

- Repository implementation
- Remote API
- Data sources

Example:

PostsRepositoryImpl  
PostsRemoteDataSource  
PostsApiService

---

# Architecture Flow

UI (Compose)  
↓  
ViewModel  
↓  
UseCase  
↓  
Repository Interface  
↓  
Repository Implementation  
↓  
Remote Data Source  
↓  
API

---

# Features

- Fetch posts from API
- Display posts list
- Navigate to post details
- Modular Clean Architecture setup

---

# Build Requirements

Minimum SDK: 24  
Compile SDK: 35

---

# Run the Project

1. Clone the repository

git clone <repo-url>

2. Open in **Android Studio**

3. Sync Gradle

4. Run the application

---

# Author

**Gokulakrishnan Mani**

Android Architect  
Clean Architecture Demo Project