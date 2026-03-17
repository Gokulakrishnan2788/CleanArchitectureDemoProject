# AGENT.md

Instructions for AI agents working with this repository.

---

# Architecture

This project follows **Clean Architecture**.

Layers:

UI → Presentation → Domain → Data

---

# Module Responsibilities

## app

Responsibilities:

- Application startup
- Navigation graph
- Dependency injection setup

Example:

AppNavGraph

---

## presentation

Responsibilities:

- Jetpack Compose UI
- ViewModels
- UI state management

Rules:

- UI only
- No business logic

---

## domain

Responsibilities:

- Business logic
- Use cases
- Repository interfaces

Rules:

- Pure Kotlin
- No Android framework dependencies

Example:

class GetPostsUseCase @Inject constructor(
private val repository: PostsRepository
) {
suspend operator fun invoke(): List<Post> =
repository.getPosts()
}

---

## data

Responsibilities:

- Repository implementations
- API services
- Data sources

Dependencies allowed:

- Retrofit
- Gson
- Hilt

---

# Dependency Rules

Allowed:

presentation → domain  
data → domain  
app → presentation  
app → data

Forbidden:

domain → presentation  
domain → data

---

# Navigation

Navigation is defined in the **app module**.

Routes:

posts  
postDetail/{postId}

---

# Coding Rules

1. Use cases represent a single business action.
2. Prefer `operator fun invoke()` for use cases.
3. UI must use Jetpack Compose.
4. Business logic belongs in domain.
5. ViewModels belong in presentation.

---

# Build System

- Gradle
- Kotlin DSL
- Version Catalog

---

# AI Agent Guidelines

When generating code:

- Respect module boundaries
- Do not introduce Android dependencies in domain
- Follow Clean Architecture principles

---

# Maintainer

Gokulakrishnan Mani