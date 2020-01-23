import "@vaadin/vaadin-button";
import { ButtonElement } from "@vaadin/vaadin-button/src/vaadin-button";

class PButton extends ButtonElement {
  connectedCallback() {
    super.connectedCallback();
    this.style.background = "red";
  }
}

customElements.define("p-button", PButton);
