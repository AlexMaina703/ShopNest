E-Commerce App
A modern, production-ready Android e-commerce application built with Kotlin, Jetpack Compose, and Clean Architecture principles. It features end-to-end network communication, reactive data binding, and robust error handling.

🛠 Tech Stack & Libraries
Language: Kotlin

UI Framework: Jetpack Compose

Asynchronous Programming: Kotlin Coroutines & Flow

Networking: Ktor Client (HttpClient, CIO engine, ContentNegotiation, Logging)

Serialization: kotlinx.serialization (JSON parsing)

Dependency Injection: Koin

Architecture: Clean Architecture + MVVM (Model-View-ViewModel)

🏗 Architecture & Design Patterns
The project enforces a strict Separation of Concerns using Clean Architecture to ensure testability, scalability, and maintainability:

┌─────────────────────────────────────────────────────────────┐
│                          UI Layer                           │
│           (Jetpack Compose Screens & ViewModels)            │
└──────────────────────────────┬──────────────────────────────┘
                               │
                               ▼
┌─────────────────────────────────────────────────────────────┐
│                        Domain Layer                         │
│           (Use Cases, Domain Models, Contracts)             │
└──────────────────────────────▲──────────────────────────────┘
                               │
                               ▼
┌─────────────────────────────────────────────────────────────┐
│                         Data Layer                          │
│     (Repositories, Ktor Network Client, DTO Mappers)        │
└─────────────────────────────────────────────────────────────┘

