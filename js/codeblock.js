class CodeBlock extends HTMLElement {
  connectedCallback() {

    const text = this.textContent.trim();

    this.innerHTML = `
      <div class="code-wrapper">
        <pre><button class="copy-btn"><svg><use href="/icons/icons.svg#copy"></use></svg></button><code>${this.toHtml(text)}</code></pre>
      </div>
    `;

    this.querySelector('.copy-btn').addEventListener('click', () => {
      navigator.clipboard.writeText(text).then(() => {
        const btn = this.querySelector('.copy-btn');
      });
    });
  }

    toHtml(str) {
        return str
        .replace(/&/g, '&amp;')
        .replace(/</g, '&lt;')
        .replace(/>/g, '&gt;');
    }
}

customElements.define('code-block', CodeBlock);