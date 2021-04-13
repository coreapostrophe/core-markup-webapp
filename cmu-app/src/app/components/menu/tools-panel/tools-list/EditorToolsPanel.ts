import ToolsPanelModel from '$app/models/tools-panel-model';

class EditorToolsPanel {
  private _toolPanelObject: ToolsPanelModel[] = [
    {name: 'Generate', toolItems: [
        {src: 'assets/svg/icon-question.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-enumerable.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-details.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-header-up.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-header-down.svg', onClick: this.onClick},
      ]},
    {name: 'Utility', toolItems: [
        {src: 'assets/svg/icon-save.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-save-as.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-open.svg', onClick: this.onClick},
        {src: 'assets/svg/icon-preferences.svg', onClick: this.onClick}
      ]},
  ];

  constructor() {

  }

  onClick(): void{
    console.log('clicked!');
  }

  get toolPanelObject(): ToolsPanelModel[] {return this._toolPanelObject; }
}

export default EditorToolsPanel;
