import React from "react";
import { storiesOf } from "@storybook/react";

import OnflineIcon, { OnflineStatus } from "../shared/components/OnflineIcon";

export default function onflineIconStories() {
  storiesOf("OnflineIcon", module)
    .add("online", () => <OnflineIcon status={OnflineStatus.Online} />)
    .add("offline", () => <OnflineIcon status={OnflineStatus.Offline} />)
    .add("fetching", () => <OnflineIcon status={OnflineStatus.Fetching} />)
    .add("unknown", () => <OnflineIcon status={OnflineStatus.Unknown} />);
}
