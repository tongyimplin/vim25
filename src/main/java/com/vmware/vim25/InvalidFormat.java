package com.vmware.vim25;

import com.vmware.vim25.InvalidDiskFormat;
import com.vmware.vim25.InvalidSnapshotFormat;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidFormat")
@XmlSeeAlso({InvalidDiskFormat.class, InvalidSnapshotFormat.class})
public class InvalidFormat extends VmConfigFault {}
