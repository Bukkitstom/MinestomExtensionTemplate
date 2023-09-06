package org.bukkitstom.yourextension

import net.minestom.server.extensions.Extension

class YourExtension : Extension() {
    override fun initialize() {
        System.out.println("Hello from extension!");
    }

    override fun terminate() {

    }
}