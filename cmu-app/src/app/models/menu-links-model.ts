class MenuLinksModel {
  name: string;
  listItems: {
    label: string,
    onClick: () => void
  }[];
}

export default MenuLinksModel;
