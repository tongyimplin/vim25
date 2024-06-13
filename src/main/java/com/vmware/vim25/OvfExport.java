package com.vmware.vim25;

import com.vmware.vim25.ConnectedIso;
import com.vmware.vim25.OvfDuplicatedPropertyIdExport;
import com.vmware.vim25.OvfDuplicatedPropertyIdImport;
import com.vmware.vim25.OvfExportFailed;
import com.vmware.vim25.OvfFault;
import com.vmware.vim25.OvfHardwareExport;
import com.vmware.vim25.OvfPropertyExport;
import com.vmware.vim25.OvfPropertyNetworkExport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfExport")
@XmlSeeAlso({OvfExportFailed.class, OvfDuplicatedPropertyIdExport.class, ConnectedIso.class, OvfDuplicatedPropertyIdImport.class, OvfPropertyExport.class, OvfPropertyNetworkExport.class, OvfHardwareExport.class})
public class OvfExport extends OvfFault {}
