package com.vmware.vim25;

import com.vmware.vim25.OvfConnectedDeviceFloppy;
import com.vmware.vim25.OvfConnectedDeviceIso;
import com.vmware.vim25.OvfHardwareExport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConnectedDevice")
@XmlSeeAlso({OvfConnectedDeviceFloppy.class, OvfConnectedDeviceIso.class})
public class OvfConnectedDevice extends OvfHardwareExport {}
