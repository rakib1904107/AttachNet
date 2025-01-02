"use client";

import React, { ReactNode } from "react";

interface LayoutProps {
  children: ReactNode;
}

const Layout: React.FC<LayoutProps> = ({ children }) => {
  return (
    <html lang="en">
      <body>
        <div className="min-h-screen bg-gradient-to-br from-indigo-50 via-white to-purple-50">
          {/* Decorative background elements */}
          <div className="fixed inset-0 z-0 overflow-hidden">
            <div className="absolute -top-1/2 -left-1/2 w-full h-full bg-gradient-to-r from-blue-100/30 to-purple-100/30 rounded-full blur-3xl" />
            <div className="absolute -bottom-1/2 -right-1/2 w-full h-full bg-gradient-to-l from-indigo-100/30 to-pink-100/30 rounded-full blur-3xl" />
          </div>
          
          <main className="relative z-10 min-h-screen flex items-center justify-center px-4">
            {children}
          </main>
        </div>
      </body>
    </html>
  );
};

export default Layout;