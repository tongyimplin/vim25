package com.vmware.vim25;

import com.vmware.vim25.CustomizationCustomName;
import com.vmware.vim25.CustomizationFixedName;
import com.vmware.vim25.CustomizationPrefixName;
import com.vmware.vim25.CustomizationUnknownName;
import com.vmware.vim25.CustomizationVirtualMachineName;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationName")
@XmlSeeAlso({CustomizationUnknownName.class, CustomizationVirtualMachineName.class, CustomizationFixedName.class, CustomizationPrefixName.class, CustomizationCustomName.class})
public class CustomizationName extends DynamicData {}
