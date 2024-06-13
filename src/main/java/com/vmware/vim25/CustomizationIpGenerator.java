package com.vmware.vim25;

import com.vmware.vim25.CustomizationCustomIpGenerator;
import com.vmware.vim25.CustomizationDhcpIpGenerator;
import com.vmware.vim25.CustomizationFixedIp;
import com.vmware.vim25.CustomizationUnknownIpGenerator;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIpGenerator")
@XmlSeeAlso({CustomizationCustomIpGenerator.class, CustomizationFixedIp.class, CustomizationDhcpIpGenerator.class, CustomizationUnknownIpGenerator.class})
public class CustomizationIpGenerator extends DynamicData {}
