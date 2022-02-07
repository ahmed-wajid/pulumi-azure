# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'HubEventHandler',
    'HubEventHandlerAuth',
    'ServiceLiveTrace',
]

@pulumi.output_type
class HubEventHandler(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "urlTemplate":
            suggest = "url_template"
        elif key == "systemEvents":
            suggest = "system_events"
        elif key == "userEventPattern":
            suggest = "user_event_pattern"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in HubEventHandler. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        HubEventHandler.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        HubEventHandler.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 url_template: str,
                 auth: Optional['outputs.HubEventHandlerAuth'] = None,
                 system_events: Optional[Sequence[str]] = None,
                 user_event_pattern: Optional[str] = None):
        """
        :param str url_template: The Event Handler URL Template. Two predefined parameters `{hub}` and `{event}` are
               available to use in the template. The value of the EventHandler URL is dynamically calculated when the client request
               comes in. Example: `http://example.com/api/{hub}/{event}`.
        :param 'HubEventHandlerAuthArgs' auth: An `auth` block as defined below.
        :param Sequence[str] system_events: Specify the list of system events. Supported values are `connect`, `connected`
               and `disconnected`.
        :param str user_event_pattern: Specify the matching event names. There are 3 kind of patterns supported:
               - `*` matches any event name
               - `,` Combine multiple events with `,` for example `event1,event2`, it matches event `event1` and `event2`
               - The single event name, for example `event1`, it matches `event1`.
        """
        pulumi.set(__self__, "url_template", url_template)
        if auth is not None:
            pulumi.set(__self__, "auth", auth)
        if system_events is not None:
            pulumi.set(__self__, "system_events", system_events)
        if user_event_pattern is not None:
            pulumi.set(__self__, "user_event_pattern", user_event_pattern)

    @property
    @pulumi.getter(name="urlTemplate")
    def url_template(self) -> str:
        """
        The Event Handler URL Template. Two predefined parameters `{hub}` and `{event}` are
        available to use in the template. The value of the EventHandler URL is dynamically calculated when the client request
        comes in. Example: `http://example.com/api/{hub}/{event}`.
        """
        return pulumi.get(self, "url_template")

    @property
    @pulumi.getter
    def auth(self) -> Optional['outputs.HubEventHandlerAuth']:
        """
        An `auth` block as defined below.
        """
        return pulumi.get(self, "auth")

    @property
    @pulumi.getter(name="systemEvents")
    def system_events(self) -> Optional[Sequence[str]]:
        """
        Specify the list of system events. Supported values are `connect`, `connected`
        and `disconnected`.
        """
        return pulumi.get(self, "system_events")

    @property
    @pulumi.getter(name="userEventPattern")
    def user_event_pattern(self) -> Optional[str]:
        """
        Specify the matching event names. There are 3 kind of patterns supported:
        - `*` matches any event name
        - `,` Combine multiple events with `,` for example `event1,event2`, it matches event `event1` and `event2`
        - The single event name, for example `event1`, it matches `event1`.
        """
        return pulumi.get(self, "user_event_pattern")


@pulumi.output_type
class HubEventHandlerAuth(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "managedIdentityId":
            suggest = "managed_identity_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in HubEventHandlerAuth. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        HubEventHandlerAuth.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        HubEventHandlerAuth.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 managed_identity_id: str):
        """
        :param str managed_identity_id: Specify the identity ID of the target resource.
        """
        pulumi.set(__self__, "managed_identity_id", managed_identity_id)

    @property
    @pulumi.getter(name="managedIdentityId")
    def managed_identity_id(self) -> str:
        """
        Specify the identity ID of the target resource.
        """
        return pulumi.get(self, "managed_identity_id")


@pulumi.output_type
class ServiceLiveTrace(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "connectivityLogsEnabled":
            suggest = "connectivity_logs_enabled"
        elif key == "httpRequestLogsEnabled":
            suggest = "http_request_logs_enabled"
        elif key == "messagingLogsEnabled":
            suggest = "messaging_logs_enabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ServiceLiveTrace. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ServiceLiveTrace.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ServiceLiveTrace.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 connectivity_logs_enabled: Optional[bool] = None,
                 enabled: Optional[bool] = None,
                 http_request_logs_enabled: Optional[bool] = None,
                 messaging_logs_enabled: Optional[bool] = None):
        """
        :param bool connectivity_logs_enabled: Whether the log category `ConnectivityLogs` is enabled? Defaults to `true`
        :param bool enabled: Whether the live trace is enabled? Defaults to `true`.
        :param bool http_request_logs_enabled: Whether the log category `HttpRequestLogs` is enabled? Defaults to `true`
        :param bool messaging_logs_enabled: Whether the log category `MessagingLogs` is enabled? Defaults to `true`
        """
        if connectivity_logs_enabled is not None:
            pulumi.set(__self__, "connectivity_logs_enabled", connectivity_logs_enabled)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if http_request_logs_enabled is not None:
            pulumi.set(__self__, "http_request_logs_enabled", http_request_logs_enabled)
        if messaging_logs_enabled is not None:
            pulumi.set(__self__, "messaging_logs_enabled", messaging_logs_enabled)

    @property
    @pulumi.getter(name="connectivityLogsEnabled")
    def connectivity_logs_enabled(self) -> Optional[bool]:
        """
        Whether the log category `ConnectivityLogs` is enabled? Defaults to `true`
        """
        return pulumi.get(self, "connectivity_logs_enabled")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Whether the live trace is enabled? Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="httpRequestLogsEnabled")
    def http_request_logs_enabled(self) -> Optional[bool]:
        """
        Whether the log category `HttpRequestLogs` is enabled? Defaults to `true`
        """
        return pulumi.get(self, "http_request_logs_enabled")

    @property
    @pulumi.getter(name="messagingLogsEnabled")
    def messaging_logs_enabled(self) -> Optional[bool]:
        """
        Whether the log category `MessagingLogs` is enabled? Defaults to `true`
        """
        return pulumi.get(self, "messaging_logs_enabled")

