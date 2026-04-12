class CodeBlock extends HTMLElement {
  connectedCallback() {

    const text = this.textContent.trim();

    this.innerHTML = `<pre><code>${this.toHtml(text)}</code></pre>`;
  }

    toHtml(str) {
        return str
        .replace(/&/g, '&amp;')
        .replace(/</g, '&lt;')
        .replace(/>/g, '&gt;');
    }
}

customElements.define('code-block', CodeBlock);