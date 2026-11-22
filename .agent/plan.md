# Project Plan

A simplified Indonesian-themed coffee shop app (Single Screen). The app displays a beautiful menu of coffee and snacks using a vibrant sunset aesthetic (oranges, browns, creams). It uses dummy data and focuses on a rich, single-page UI with cards, lists, and images. No navigation or API required.

## Project Brief

# Project Brief: Kopi Senja (MVP)

**Kopi Senja** (Sunset Coffee) is a high-quality, single-screen Android application designed to showcase a vibrant Indonesian coffee shop menu. The app focuses on a rich, aesthetic user interface that captures the "Golden Hour" atmosphere through a curated palette of oranges, browns, and creams, providing a premium digital storefront experience.

---

### Features
*   **Immersive Single-Screen Layout**: A cohesive, high-performance one-page UI using Material Design 3, featuring a "Selamat Sore" (Good Evening) greeting and a seamless scrollable menu.
*   **Themed Menu Gallery**: A visually striking grid of coffee and snacks (e.g., Kopi Susu Gula Aren, Pisang Goreng) displayed using high-fidelity `Card` components.
*   **Interactive Visual Feedback**: Real-time UI state changes and selection highlights when users interact with specific menu items.
*   **Sunset Aesthetic Theming**: A bespoke color system utilizing vibrant oranges, deep espresso browns, and warm sand-creams to create an energetic yet relaxing vibe.

---

### High-Level Technical Stack

*   **Kotlin**: The primary language for modern and safe Android development.
*   **Jetpack Compose**: The declarative UI toolkit used to build the single-screen layout (Box, Column, Row, and LazyVerticalGrid).
*   **Material Design 3 (M3)**: For standardizing components and implementing an adaptive, energetic color scheme.
*   **KSP (Kotlin Symbol Processing)**: Optimized tool for code generation and handling annotations.
*   **Coil**: An image loading library used for efficient rendering of high-quality coffee and snack visuals within Compose.

## Implementation Steps
**Total Duration:** 33m 58s

### Task_1_Setup_Theme_And_Models: Setup Material 3 theme with a sunset color palette (oranges, browns, creams). Implement Edge-to-Edge display. Define data models for Coffee, Snacks, and Stores. Setup Retrofit/Moshi for menu data fetching.
- **Status:** COMPLETED
- **Updates:** Implemented Material 3 theme with sunset colors (oranges, browns, creams), enabled edge-to-edge display, and defined data models for Coffee, Snacks, and Stores. Configured Retrofit and Moshi for networking. Project builds successfully with compileSdk/targetSdk 37.
- **Acceptance Criteria:**
  - Material 3 theme implemented with custom colors
  - Edge-to-edge display active
  - Data models and Retrofit service defined
  - Project builds successfully
- **Duration:** 9m 6s

### Task_2_Menu_And_Details: Build the Home/Menu screen displaying coffee and snack categories. Implement the Item Details screen where users can customize their order (sugar, ice levels).
- **Status:** COMPLETED
- **Updates:** Implemented the Home/Menu screen with categories for coffee and snacks using LazyColumn and Coil for images. Created the Item Details screen with customization options for sugar and ice levels using FilterChip. Set up Jetpack Compose Navigation to handle screen transitions. All UI components follow the sunset Material 3 theme.
- **Acceptance Criteria:**
  - Menu displays items with images using Coil
  - Navigation between Menu and Details works
  - Customization options are selectable in Detail screen
- **Duration:** 5m 17s

### Task_3_Cart_Management: Implement a shopping cart to manage selected items. Create a Cart screen with an order summary and a simple checkout button.
- **Status:** COMPLETED
- **Updates:** Implemented CartItem model and CartRepository to manage selections. Created CartScreen with item listing, quantity controls, and total price calculation. Updated DetailScreen to include 'Add to Cart' functionality. Integrated Cart navigation and added a cart icon to the Home screen. The checkout process clears the cart and returns the user to the menu. Project follows Material 3 sunset theme throughout.
- **Acceptance Criteria:**
  - Items can be added to and removed from cart
  - Cart shows correct total price
  - Checkout flow is initiated
- **Duration:** 3m 26s

### Task_4_Store_Locator_And_Branding: Implement the Store Locator feature to find nearby coffee shops. Create an adaptive app icon matching the 'Kopi Senja' theme.
- **Status:** COMPLETED
- **Updates:** Implemented the Store Locator feature with a list of coffee shops, addresses, and operating hours. Integrated Google Maps navigation via Intents. Enhanced the app's visual identity by adding cafe-themed background images and overlays to the Menu, Store, and Detail screens. Created and applied an adaptive app icon matching the 'Sunset Coffee' theme. The UI now feels immersive and aligned with the Kopi Senja branding.
- **Acceptance Criteria:**
  - Nearby stores are displayed
  - Adaptive app icon is generated and applied
  - App branding matches the sunset theme
- **Duration:** 8m 54s

### Task_5_Refactor_To_Single_Screen: Refactor the existing multi-screen architecture into a high-fidelity single-screen MVP. Implement a 'Selamat Sore' greeting and a scrollable grid of coffee and snacks using dummy data. Remove navigation logic and external API dependencies, focusing on a rich, one-page UI with selection highlights.
- **Status:** COMPLETED
- **Updates:** Consolidated the entire application into a single-screen MVP. Replaced the multi-screen navigation (NavHost, NavGraph) with a unified MainScreen in MainActivity.kt. Implemented a 'Selamat Sore' greeting and a high-fidelity LazyVerticalGrid for coffee and snacks using dummy data and Coil images. Added interactive selection highlights that animate card colors and display checkmarks upon selection. Maintained the vibrant Material 3 sunset theme and full edge-to-edge support. Cleaned up unused models and navigation logic.
- **Acceptance Criteria:**
  - App is consolidated into a single screen
  - 'Selamat Sore' greeting is displayed
  - Menu grid uses dummy data with high-fidelity visuals
  - Selection highlights and interactive feedback are implemented
  - Navigation components are removed
- **Duration:** 7m 15s

### Task_6_Run_And_Verify: Run the application to verify stability, Material Design 3 compliance, and alignment with the 'Golden Hour' atmosphere. Instruct critic_agent to verify that all requirements are met on the single screen and that no crashes occur.
- **Status:** IN_PROGRESS
- **Acceptance Criteria:**
  - App does not crash
  - Build passes
  - All features function on a single screen
  - UI follows Material 3 and vibrant sunset theme
  - Make sure all existing tests pass
- **StartTime:** 2026-11-18 16:36:06 WITA

