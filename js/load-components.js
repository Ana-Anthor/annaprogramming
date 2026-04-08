fetch("/components/navigation.html")
            .then(response => response.text())
            .then(data => {
                document.getElementById("nav").innerHTML = data;
            })
            .catch(error => {
                console.error("Navigation failed to load:", error);
            });

document.addEventListener("DOMContentLoaded", () => {
    const components = document.querySelectorAll("[data-component]");
    components.forEach(async (element) => {
        const name = element.dataset.component; 
        try {
            const response = await fetch(`/components/${name}.html`);
            const html = await response.text();
            element.innerHTML = html;
        } catch (error) {
            console.error(`Failed to load component: ${name}`, error);
        }
  });
});