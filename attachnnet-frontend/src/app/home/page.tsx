"use client";

import AttachNetLogo from '../components/AttachNetLogo';
import Link from 'next/link';

export default function Home() {
   
  return (
    <div className="w-full max-w-md p-8 bg-white/80 backdrop-blur-lg rounded-2xl shadow-xl border border-white/20">
      {/* Logo and Title */}
      <div className="flex flex-col items-center mb-10">
        <div className="w-16 h-16 bg-gradient-to-tr from-blue-600 to-indigo-600 rounded-full flex items-center justify-center mb-6 shadow-lg ring-2 ring-white">
          <AttachNetLogo/>
        </div>

        <h1 className="text-3xl font-bold bg-gradient-to-r from-blue-600 via-purple-600 to-indigo-500 bg-clip-text text-transparent">
          Welcome To Attach-Net
        </h1>
      </div>


      <div className="space-y-6">
        {/* Get Started Button */}
          <Link href='/signup'>
            <button 
            className="relative w-full py-3 px-4 bg-gradient-to-r from-blue-600 via-purple-600 to-pink-500 text-white rounded-xl font-medium 
            shadow-lg transition-all duration-300 ease-in-out
            hover:shadow-indigo-500/25 hover:shadow-2xl
            hover:scale-105 hover:from-blue-500 hover:to-indigo-500
            active:scale-95 active:shadow-lg
            focus:ring-2 focus:ring-blue-500 focus:ring-offset-2
            overflow-hidden group"
          >
            <span className="relative z-10 flex items-center justify-center gap-2">
              Get Started
            </span>
            <div className="absolute inset-0 bg-gradient-to-r from-blue-400 to-indigo-400 opacity-0 group-hover:opacity-100 transition-opacity duration-300" />
          </button>
          </Link>


        {/* Sign In Option */}
        <div className="text-center mt-6 text-sm text-gray-600">
          Already have an Account?
          <a href="/login" className="text-blue-600 hover:text-indigo-600 font-medium hover:underline ml-1.5 transition-colors">
            Sign in
          </a>
        </div>
      </div>
    </div>
  );
}
