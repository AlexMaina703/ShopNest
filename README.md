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
Key Highlights
Domain Abstraction: The UI layer never interacts with raw Data Transfer Objects (DTOs) or network libraries directly.

Inline Reified Network Helpers: Centralized HTTP request handling using generic, type-safe wrappers (makeWebRequest) that encapsulate Ktor calls and handle deserialization dynamically.

Global Error Wrapping: Network responses are mapped into unified ResultWrapper.Success or ResultWrapper.Failure structures to protect the UI layer from uncaught exceptions (ClientRequestException, IOException).

📂 Project Structure
Plaintext
com.example.app/
├── data/
│   ├── di/              # Koin DI modules (networkModule, repositoryModule)
│   ├── model/           # API DTO models (DataProductModel)
│   ├── mapper/          # DTO to Domain Mappers
│   └── network/         # Ktor client implementation & helper functions
├── domain/
│   ├── model/           # Core enterprise/business models (Product)
│   ├── repository/      # Repository interfaces
│   └── network/         # Network contracts/interfaces
└── ui/                  # Composables, state holders, and ViewModels
🚀 Getting Started
Prerequisites
Android Studio Ladybug (or newer)

JDK 17 or higher

Minimum SDK level: 24 (Android 7.0)

Installation
Clone the repository:

Bash
git clone https://github.com/your-username/your-repo-name.git
Open in Android Studio and sync Gradle files.

Run the app on an emulator or physical device.
