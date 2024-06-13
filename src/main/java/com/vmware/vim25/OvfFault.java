package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerCallbackFault;
import com.vmware.vim25.OvfExport;
import com.vmware.vim25.OvfImport;
import com.vmware.vim25.OvfInvalidPackage;
import com.vmware.vim25.OvfSystemFault;
import com.vmware.vim25.OvfUnsupportedPackage;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfFault")
@XmlSeeAlso({OvfUnsupportedPackage.class, OvfConsumerCallbackFault.class, OvfImport.class, OvfExport.class, OvfInvalidPackage.class, OvfSystemFault.class})
public class OvfFault extends VimFault {}
