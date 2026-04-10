
document.addEventListener("DOMContentLoaded", () => {
    const components = document.querySelectorAll("[data-component]");
    components.forEach(async (element) => {
        const name = element.dataset.component; 
        try {
            const response = await fetch(`/components/${name}.html`);
            const html = await response.text();
            element.outerHTML = html;
        } catch (error) {
            console.error(`Failed to load component: ${name}`, error);
        }
  });
});