package com.vmware.vim25;

import com.vmware.vim25.MissingPowerOffConfiguration;
import com.vmware.vim25.MissingPowerOnConfiguration;
import com.vmware.vim25.NoVmInVApp;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppConfigFault")
@XmlSeeAlso({NoVmInVApp.class, MissingPowerOnConfiguration.class, MissingPowerOffConfiguration.class})
public class VAppConfigFault extends VimFault {}
