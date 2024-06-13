package com.vmware.vim25;

import com.vmware.vim25.CustomizationAutoIpV6Generator;
import com.vmware.vim25.CustomizationCustomIpV6Generator;
import com.vmware.vim25.CustomizationDhcpIpV6Generator;
import com.vmware.vim25.CustomizationFixedIpV6;
import com.vmware.vim25.CustomizationStatelessIpV6Generator;
import com.vmware.vim25.CustomizationUnknownIpV6Generator;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIpV6Generator")
@XmlSeeAlso({CustomizationCustomIpV6Generator.class, CustomizationStatelessIpV6Generator.class, CustomizationUnknownIpV6Generator.class, CustomizationFixedIpV6.class, CustomizationDhcpIpV6Generator.class, CustomizationAutoIpV6Generator.class})
public class CustomizationIpV6Generator extends DynamicData {}
