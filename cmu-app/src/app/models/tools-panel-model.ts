class ToolsPanelModel {
  name: string;
  toolItems: {
    src: string,
    onClick: () => void
  }[];
}

export default ToolsPanelModel;
