<div>



&nbsp; <details open>

&nbsp;   <summary><strong>🇪🇸 Español</strong></summary>

&nbsp;   <br>



&nbsp;   <h1>API RESTful de Tareas Pendientes (To-Do List) 📝</h1>

&nbsp;   <p>Este proyecto es una API RESTful robusta para gestionar una lista de tareas pendientes (To-Do)...</p>

&nbsp;   <!-- Aquí puedes pegar el contenido completo en español que ya tienes -->



&nbsp; </details>



&nbsp; <details>

&nbsp;   <summary><strong>🇬🇧 English</strong></summary>

&nbsp;   <br>



&nbsp;   <h1>To-Do List RESTful API 📝</h1>

&nbsp;   <p>This project is a robust RESTful API for managing a to-do list. Built with <strong>Spring Boot</strong>, it follows industry best practices including DTO usage, data validation, global exception handling, and a decoupled service architecture.</p>



&nbsp;   <h2>✨ Main Features</h2>

&nbsp;   <ul>

&nbsp;     <li><strong>Full CRUD operations</strong>: Create, Read (all and by ID), Update, and Delete tasks.</li>

&nbsp;     <li><strong>DTOs (Data Transfer Objects)</strong>: Separates database model from public API using <code>TaskRequestDTO</code> and <code>TaskResponseDTO</code>.</li>

&nbsp;     <li><strong>Data Validation</strong>: Uses <code>jakarta.validation</code> (<code>@NotBlank</code>, <code>@Size</code>) to ensure input integrity.</li>

&nbsp;     <li><strong>Global Exception Handling</strong>: Implements <code>@ControllerAdvice</code> to catch errors (like 404 and 400) and return clean JSON responses.</li>

&nbsp;     <li><strong>In-Memory Database</strong>: Configured with H2 for fast development and testing.</li>

&nbsp;     <li><strong>Clean Code</strong>: Uses <strong>Lombok</strong> to reduce boilerplate code.</li>

&nbsp;   </ul>



&nbsp;   <h2>🛠️ Technologies Used</h2>

&nbsp;   <ul>

&nbsp;     <li>Java 17</li>

&nbsp;     <li>Spring Boot 3.x</li>

&nbsp;     <li>Spring Web</li>

&nbsp;     <li>Spring Data JPA</li>

&nbsp;     <li>H2 Database</li>

&nbsp;     <li>Spring Boot Starter Validation</li>

&nbsp;     <li>Lombok</li>

&nbsp;     <li>Maven</li>

&nbsp;   </ul>



&nbsp;   <h2>🚀 How to Run the Project</h2>

&nbsp;   <ol>

&nbsp;     <li><strong>Clone the repository</strong>

&nbsp;       <pre><code>git clone \&lt;YOUR-REPO-URL\&gt;

cd todo-api</code></pre>

&nbsp;     </li>

&nbsp;     <li><strong>Run the application</strong> via IDE or terminal:

&nbsp;       <pre><code>mvn spring-boot:run</code></pre>

&nbsp;     </li>

&nbsp;     <li>API will be available at <code>http://localhost:8080</code></li>

&nbsp;   </ol>



&nbsp;   <h2>🎮 Access H2 Console</h2>

&nbsp;   <p>Visit <code>http://localhost:8080/h2-console</code> and use:</p>

&nbsp;   <ul>

&nbsp;     <li>Driver Class: <code>org.h2.Driver</code></li>

&nbsp;     <li>JDBC URL: <code>jdbc:h2:mem:tododb</code></li>

&nbsp;     <li>User Name: <code>sa</code></li>

&nbsp;     <li>Password: (leave blank)</li>

&nbsp;   </ul>



&nbsp;   <h2>📖 API Endpoints</h2>

&nbsp;   <p>Base URL: <code>http://localhost:8080/api/tasks</code></p>

&nbsp;   <!-- Puedes traducir la tabla de endpoints si lo deseas -->



&nbsp;   <h2>⚠️ Error Handling</h2>

&nbsp;   <p>Centralized error handling returns clean JSON responses.</p>



&nbsp; </details>



&nbsp; <details>

&nbsp;   <summary><strong>🇮🇹 Italiano</strong></summary>

&nbsp;   <br>



&nbsp;   <h1>API RESTful per Lista di Attività 📝</h1>

&nbsp;   <p>Questo progetto è una robusta API RESTful per gestire una lista di attività da fare. Costruita con <strong>Spring Boot</strong>, segue le migliori pratiche del settore come l’uso di DTO, la validazione dei dati, la gestione globale delle eccezioni e un’architettura a servizi disaccoppiati.</p>



&nbsp;   <h2>✨ Caratteristiche Principali</h2>

&nbsp;   <ul>

&nbsp;     <li><strong>Operazioni CRUD complete</strong>: Crea, Leggi (tutte e per ID), Aggiorna ed Elimina attività.</li>

&nbsp;     <li><strong>DTOs (Data Transfer Objects)</strong>: Separa il modello del database dall’API pubblica usando <code>TaskRequestDTO</code> e <code>TaskResponseDTO</code>.</li>

&nbsp;     <li><strong>Validazione dei Dati</strong>: Utilizza <code>jakarta.validation</code> (<code>@NotBlank</code>, <code>@Size</code>) per garantire l’integrità degli input.</li>

&nbsp;     <li><strong>Gestione Globale delle Eccezioni</strong>: Implementa <code>@ControllerAdvice</code> per catturare errori (come 404 e 400) e restituire risposte JSON pulite.</li>

&nbsp;     <li><strong>Database In-Memory</strong>: Configurato con H2 per sviluppo e test rapidi.</li>

&nbsp;     <li><strong>Codice Pulito</strong>: Utilizza <strong>Lombok</strong> per ridurre il codice boilerplate.</li>

&nbsp;   </ul>



&nbsp;   <h2>🛠️ Tecnologie Utilizzate</h2>

&nbsp;   <ul>

&nbsp;     <li>Java 17</li>

&nbsp;     <li>Spring Boot 3.x</li>

&nbsp;     <li>Spring Web</li>

&nbsp;     <li>Spring Data JPA</li>

&nbsp;     <li>H2 Database</li>

&nbsp;     <li>Spring Boot Starter Validation</li>

&nbsp;     <li>Lombok</li>

&nbsp;     <li>Maven</li>

&nbsp;   </ul>



&nbsp;   <h2>🚀 Come Eseguire il Progetto</h2>

&nbsp;   <ol>

&nbsp;     <li><strong>Clona il repository</strong>

&nbsp;       <pre><code>git clone \&lt;URL-DEL-TUO-REPO\&gt;

cd todo-api</code></pre>

&nbsp;     </li>

&nbsp;     <li><strong>Esegui l’applicazione</strong> via IDE o terminale:

&nbsp;       <pre><code>mvn spring-boot:run</code></pre>

&nbsp;     </li>

&nbsp;     <li>L’API sarà disponibile su <code>http://localhost:8080</code></li>

&nbsp;   </ol>



&nbsp;   <h2>🎮 Accesso alla Console H2</h2>

&nbsp;   <p>Visita <code>http://localhost:8080/h2-console</code> e usa:</p>

&nbsp;   <ul>

&nbsp;     <li>Driver Class: <code>org.h2.Driver</code></li>

&nbsp;     <li>JDBC URL: <code>jdbc:h2:mem:tododb</code></li>

&nbsp;     <li>User Name: <code>sa</code></li>

&nbsp;     <li>Password: (lascia vuoto)</li>

&nbsp;   </ul>



&nbsp;   <h2>📖 Endpoint dell’API</h2>

&nbsp;   <p>URL base: <code>http://localhost:8080/api/tasks</code></p>



&nbsp;   <h2>⚠️ Gestione degli Errori</h2>

&nbsp;   <p>La gestione centralizzata degli errori restituisce risposte JSON chiare.</p>



&nbsp; </details>



</div>

