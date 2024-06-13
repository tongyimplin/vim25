package com.vmware.vim25;

import com.vmware.vim25.OvfDiskMappingNotFound;
import com.vmware.vim25.OvfFault;
import com.vmware.vim25.OvfHostValueNotParsed;
import com.vmware.vim25.OvfInternalError;
import com.vmware.vim25.OvfToXmlUnsupportedElement;
import com.vmware.vim25.OvfUnknownDevice;
import com.vmware.vim25.OvfUnknownEntity;
import com.vmware.vim25.OvfUnsupportedDeviceBackingInfo;
import com.vmware.vim25.OvfUnsupportedDeviceBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfSystemFault")
@XmlSeeAlso({OvfUnsupportedDeviceBackingOption.class, OvfToXmlUnsupportedElement.class, OvfUnknownEntity.class, OvfUnknownDevice.class, OvfInternalError.class, OvfHostValueNotParsed.class, OvfUnsupportedDeviceBackingInfo.class, OvfDiskMappingNotFound.class})
public class OvfSystemFault extends OvfFault {}
