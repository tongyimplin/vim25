package com.vmware.vim25;

import com.vmware.vim25.CustomizationLinuxOptions;
import com.vmware.vim25.CustomizationWinOptions;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationOptions")
@XmlSeeAlso({CustomizationLinuxOptions.class, CustomizationWinOptions.class})
public class CustomizationOptions extends DynamicData {}
