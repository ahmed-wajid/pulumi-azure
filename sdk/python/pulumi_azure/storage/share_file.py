# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ShareFileArgs', 'ShareFile']

@pulumi.input_type
class ShareFileArgs:
    def __init__(__self__, *,
                 storage_share_id: pulumi.Input[str],
                 content_disposition: Optional[pulumi.Input[str]] = None,
                 content_encoding: Optional[pulumi.Input[str]] = None,
                 content_md5: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ShareFile resource.
        :param pulumi.Input[str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        :param pulumi.Input[str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[str] content_md5: The MD5 sum of the file contents. Changing this forces a new resource to be created.
        :param pulumi.Input[str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
        :param pulumi.Input[str] source: An absolute path to a file on the local system.
        """
        pulumi.set(__self__, "storage_share_id", storage_share_id)
        if content_disposition is not None:
            pulumi.set(__self__, "content_disposition", content_disposition)
        if content_encoding is not None:
            pulumi.set(__self__, "content_encoding", content_encoding)
        if content_md5 is not None:
            pulumi.set(__self__, "content_md5", content_md5)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if source is not None:
            pulumi.set(__self__, "source", source)

    @property
    @pulumi.getter(name="storageShareId")
    def storage_share_id(self) -> pulumi.Input[str]:
        """
        The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_share_id")

    @storage_share_id.setter
    def storage_share_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_share_id", value)

    @property
    @pulumi.getter(name="contentDisposition")
    def content_disposition(self) -> Optional[pulumi.Input[str]]:
        """
        Sets the file’s Content-Disposition header.
        """
        return pulumi.get(self, "content_disposition")

    @content_disposition.setter
    def content_disposition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_disposition", value)

    @property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies which content encodings have been applied to the file.
        """
        return pulumi.get(self, "content_encoding")

    @content_encoding.setter
    def content_encoding(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_encoding", value)

    @property
    @pulumi.getter(name="contentMd5")
    def content_md5(self) -> Optional[pulumi.Input[str]]:
        """
        The MD5 sum of the file contents. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "content_md5")

    @content_md5.setter
    def content_md5(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_md5", value)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[str]]:
        """
        The content type of the share file. Defaults to `application/octet-stream`.
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_type", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of metadata to assign to this file.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        An absolute path to a file on the local system.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)


@pulumi.input_type
class _ShareFileState:
    def __init__(__self__, *,
                 content_disposition: Optional[pulumi.Input[str]] = None,
                 content_encoding: Optional[pulumi.Input[str]] = None,
                 content_md5: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 storage_share_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ShareFile resources.
        :param pulumi.Input[str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[str] content_md5: The MD5 sum of the file contents. Changing this forces a new resource to be created.
        :param pulumi.Input[str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
        :param pulumi.Input[str] source: An absolute path to a file on the local system.
        :param pulumi.Input[str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        if content_disposition is not None:
            pulumi.set(__self__, "content_disposition", content_disposition)
        if content_encoding is not None:
            pulumi.set(__self__, "content_encoding", content_encoding)
        if content_md5 is not None:
            pulumi.set(__self__, "content_md5", content_md5)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if storage_share_id is not None:
            pulumi.set(__self__, "storage_share_id", storage_share_id)

    @property
    @pulumi.getter(name="contentDisposition")
    def content_disposition(self) -> Optional[pulumi.Input[str]]:
        """
        Sets the file’s Content-Disposition header.
        """
        return pulumi.get(self, "content_disposition")

    @content_disposition.setter
    def content_disposition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_disposition", value)

    @property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies which content encodings have been applied to the file.
        """
        return pulumi.get(self, "content_encoding")

    @content_encoding.setter
    def content_encoding(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_encoding", value)

    @property
    @pulumi.getter(name="contentMd5")
    def content_md5(self) -> Optional[pulumi.Input[str]]:
        """
        The MD5 sum of the file contents. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "content_md5")

    @content_md5.setter
    def content_md5(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_md5", value)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[str]]:
        """
        The content type of the share file. Defaults to `application/octet-stream`.
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_type", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of metadata to assign to this file.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        An absolute path to a file on the local system.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter(name="storageShareId")
    def storage_share_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_share_id")

    @storage_share_id.setter
    def storage_share_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_share_id", value)


class ShareFile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_disposition: Optional[pulumi.Input[str]] = None,
                 content_encoding: Optional[pulumi.Input[str]] = None,
                 content_md5: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 storage_share_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a File within an Azure Storage File Share.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_share = azure.storage.Share("exampleShare",
            storage_account_name=example_account.name,
            quota=50)
        example_share_file = azure.storage.ShareFile("exampleShareFile",
            storage_share_id=example_share.id,
            source="some-local-file.zip")
        ```

        ## Import

        Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:storage/shareFile:ShareFile example https://account1.file.core.windows.net/share1/file1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[str] content_md5: The MD5 sum of the file contents. Changing this forces a new resource to be created.
        :param pulumi.Input[str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
        :param pulumi.Input[str] source: An absolute path to a file on the local system.
        :param pulumi.Input[str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ShareFileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a File within an Azure Storage File Share.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_share = azure.storage.Share("exampleShare",
            storage_account_name=example_account.name,
            quota=50)
        example_share_file = azure.storage.ShareFile("exampleShareFile",
            storage_share_id=example_share.id,
            source="some-local-file.zip")
        ```

        ## Import

        Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:storage/shareFile:ShareFile example https://account1.file.core.windows.net/share1/file1
        ```

        :param str resource_name: The name of the resource.
        :param ShareFileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ShareFileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_disposition: Optional[pulumi.Input[str]] = None,
                 content_encoding: Optional[pulumi.Input[str]] = None,
                 content_md5: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 storage_share_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ShareFileArgs.__new__(ShareFileArgs)

            __props__.__dict__["content_disposition"] = content_disposition
            __props__.__dict__["content_encoding"] = content_encoding
            __props__.__dict__["content_md5"] = content_md5
            __props__.__dict__["content_type"] = content_type
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
            __props__.__dict__["path"] = path
            __props__.__dict__["source"] = source
            if storage_share_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_share_id'")
            __props__.__dict__["storage_share_id"] = storage_share_id
        super(ShareFile, __self__).__init__(
            'azure:storage/shareFile:ShareFile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            content_disposition: Optional[pulumi.Input[str]] = None,
            content_encoding: Optional[pulumi.Input[str]] = None,
            content_md5: Optional[pulumi.Input[str]] = None,
            content_type: Optional[pulumi.Input[str]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[str]] = None,
            storage_share_id: Optional[pulumi.Input[str]] = None) -> 'ShareFile':
        """
        Get an existing ShareFile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[str] content_md5: The MD5 sum of the file contents. Changing this forces a new resource to be created.
        :param pulumi.Input[str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
        :param pulumi.Input[str] source: An absolute path to a file on the local system.
        :param pulumi.Input[str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ShareFileState.__new__(_ShareFileState)

        __props__.__dict__["content_disposition"] = content_disposition
        __props__.__dict__["content_encoding"] = content_encoding
        __props__.__dict__["content_md5"] = content_md5
        __props__.__dict__["content_type"] = content_type
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["path"] = path
        __props__.__dict__["source"] = source
        __props__.__dict__["storage_share_id"] = storage_share_id
        return ShareFile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contentDisposition")
    def content_disposition(self) -> pulumi.Output[Optional[str]]:
        """
        Sets the file’s Content-Disposition header.
        """
        return pulumi.get(self, "content_disposition")

    @property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies which content encodings have been applied to the file.
        """
        return pulumi.get(self, "content_encoding")

    @property
    @pulumi.getter(name="contentMd5")
    def content_md5(self) -> pulumi.Output[Optional[str]]:
        """
        The MD5 sum of the file contents. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "content_md5")

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> pulumi.Output[Optional[str]]:
        """
        The content type of the share file. Defaults to `application/octet-stream`.
        """
        return pulumi.get(self, "content_type")

    @property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of metadata to assign to this file.
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[Optional[str]]:
        """
        The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional[str]]:
        """
        An absolute path to a file on the local system.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="storageShareId")
    def storage_share_id(self) -> pulumi.Output[str]:
        """
        The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_share_id")
