Investment Snapshot is a sophisticated yet user-friendly Android application meticulously crafted to empower users in managing and monitoring their diverse investment portfolios. It goes beyond simple tracking by providing a centralized dashboard for a variety of asset classes, including traditional investments like shares and REITs, as well as local and cooperative investments such as SACCOs and land.

Core Functionality and User Experience
Comprehensive Asset Management: The application's core functionality is to enable the seamless addition and management of various investment assets. This includes stocks and bonds, shares in Savings and Credit Co-operative Organizations (SACCOs), real estate holdings (land), and investments in Real Estate Investment Trusts (REITs). Each asset can be logged with relevant details, providing a granular view of the user's total wealth.

Intuitive and Structured UI: The user interface is built using a clean, structured XML-based framework, which ensures a consistent and responsive experience across different Android devices. The organized layout with clear categories and a logical navigation flow makes it easy for even novice investors to understand their portfolio at a glance.

Persistent and Reliable Storage: The application leverages a Firebase Realtime Database for persistent storage. This powerful backend service ensures that all user data is safely stored in the cloud and is accessible from any device, providing a reliable and always-on record of the user's investments. The use of Firebase also allows for seamless synchronization, so any updates are reflected instantly.

Holistic Portfolio View: Users can view a holistic portfolio overview, which categorizes their assets by type. This feature provides immediate insights into the distribution of their wealth, allowing for better-informed investment decisions.

Technical Architecture
Language: Kotlin - The application is developed entirely in Kotlin, a modern and concise language officially endorsed by Google for Android development. Kotlin's interoperability with existing Android APIs and its focus on safety and expressiveness make it the ideal choice for building a robust and maintainable application.

UI Framework: Android XML Layouts - The user interface is designed using Android XML layouts. This declarative approach separates the design from the application logic, allowing for a more flexible and scalable UI architecture.

Architecture: MVVM - The application follows the Model-View-ViewModel (MVVM) architectural pattern. This clean separation of concerns enhances testability, maintainability, and scalability.

Model: Handles data logic and business rules.

View: The UI layer (XML layouts) that observes changes in the ViewModel.

ViewModel: Serves as a bridge between the View and the Model, exposing data and handling user actions.

Persistence: Firebase Realtime Database - The Firebase Realtime Database is utilized for its real-time data syncing capabilities and robust cloud storage. This ensures that a user's investment portfolio is always up-to-date and securely backed up.

SDK Versions:

Minimum SDK: 24 (Android 7.0 Nougat) - The application is designed to be compatible with a broad range of devices, targeting a minimum SDK version that includes a vast majority of active Android users.

Target SDK: 36 (Android 12) - The application is optimized for the latest Android OS, ensuring it can take advantage of the newest features, security updates, and performance improvements.

Build System: Gradle (Kotlin DSL) - The project uses Gradle with Kotlin DSL for its build system. This provides a more type-safe and readable build configuration compared to the traditional Groovy-based scripts. This helps ensure build consistency and simplifies project management.