package com.vmware.vim25;

import com.vmware.vim25.CustomizationLinuxPrep;
import com.vmware.vim25.CustomizationSysprep;
import com.vmware.vim25.CustomizationSysprepText;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIdentitySettings")
@XmlSeeAlso({CustomizationLinuxPrep.class, CustomizationSysprep.class, CustomizationSysprepText.class})
public class CustomizationIdentitySettings extends DynamicData {}
