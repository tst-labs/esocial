import React from "react";
import { Link } from "react-router-dom";
import { Menu, Icon } from "semantic-ui-react";
import { childrenDefaultPropType } from "../shared/PropTypesHelper";

function BaseMenu({ extraItems }) {
  return (
    <Menu fluid pointing secondary>
      <Menu.Item>
        <Icon name="users" size="large" color="teal" />
      </Menu.Item>
      <Menu.Item name="ESOCIAL" as={Link} to="/" active={false} />
      {extraItems}
    </Menu>
  );
}

BaseMenu.propTypes = {
  extraItems: childrenDefaultPropType
};

export default BaseMenu;
